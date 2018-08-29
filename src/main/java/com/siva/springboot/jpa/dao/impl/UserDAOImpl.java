package com.siva.springboot.jpa.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.siva.springboot.jpa.dao.UserDAO;
import com.siva.springboot.jpa.domain.User;

@Repository
public class UserDAOImpl implements UserDAO{

	private SessionFactory sessionFactory;
	 
    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	@Override
	public User findById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User)session.find(User.class, id);
		System.out.println("User name["+user.getName()+"]");
		return user;
	}

}
