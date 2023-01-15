package com.spring.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.model.Product;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create product
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}

	// get all products
	public List<Product> getProducts() {
		List<Product> allProducts = this.hibernateTemplate.loadAll(Product.class);
		return allProducts;
	}

	// get product by id
	public Product getProduct(int pid) {
		Product product = this.hibernateTemplate.load(Product.class, pid);
		return product;
	}
	
	// get product by id
	@Transactional
	public void deleteProduct(int pid) {
		Product product = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
	}
	
	
	
	
}
