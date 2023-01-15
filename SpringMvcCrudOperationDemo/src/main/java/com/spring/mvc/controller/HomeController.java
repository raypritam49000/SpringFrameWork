package com.spring.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mvc.dao.ProductDao;
import com.spring.mvc.model.Product;

@Controller
public class HomeController {
	
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(ModelMap map) {
	 List<Product> list = this.productDao.getProducts();
	 map.addAttribute("list",list);
		return "home";
	}
	
	// show add product
	@RequestMapping("/addproduct")
	public String addProduct(ModelMap map) {
		map.addAttribute("title","Add Product");
		return "addProduct";
	}
	
	//handle add form
	@RequestMapping(value="/handleProduct",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request) {
		System.out.println(product);
		this.productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	// delete Product handler
	@RequestMapping(value="/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request) {
		this.productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	// update Product handler
	@RequestMapping(value="/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId,Model model) {
		Product product = this.productDao.getProduct(productId);
		model.addAttribute("product",product);
		return "update";
	}
}
