package com.cly.ssh.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cly.ssh.dao.UserDao;
import com.cly.ssh.model.User;

public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}




	public User userLogin(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//session.createQuery("from User where userName=? and password=?");
		Query query = session.createQuery("from User where userName = :userName and password = :password");
		query.setString("userName", user.getUserName());
		query.setString("password", user.getPassword());
		User resultUser = (User) query.uniqueResult();
		transaction.commit();
		session.close();
		return resultUser;
	}

}
