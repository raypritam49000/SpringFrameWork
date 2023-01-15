package com.spring.orm.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.model.Student;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/orm");
		ds.setUsername("root");
		ds.setPassword("1998");
		return ds;
	}

	@SuppressWarnings("unused")
	private final Properties getHibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		hibernateProperties.setProperty("hiberanate.show_sql", "true");
		hibernateProperties.setProperty("hiberanate.format_sql", "true");
		return hibernateProperties;
	}

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());
		factoryBean.setHibernateProperties(getHibernateProperties());
		factoryBean.setAnnotatedClasses(Student.class);
		return factoryBean;
	}
	
	

	@Bean
	public PlatformTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getLocalSessionFactoryBean().getObject());
		return transactionManager;
	}
	
	@Bean
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(getLocalSessionFactoryBean().getObject());
		return hibernateTemplate;
	}
	
	@Bean
	public StudentDao getStudentDao() {
		StudentDao studentDao = new StudentDao();
		studentDao.setHibernateTemplate(getHibernateTemplate());
		return studentDao;
	}
	
	
}