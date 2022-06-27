package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entities.User;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public List<User> listUsers() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.openSession().createQuery("from User");
		return query.getResultList();
	}

}