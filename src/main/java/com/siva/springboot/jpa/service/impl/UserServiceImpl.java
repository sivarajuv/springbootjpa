package com.siva.springboot.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siva.springboot.jpa.dao.UserDAO;
import com.siva.springboot.jpa.domain.User;
import com.siva.springboot.jpa.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
   
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
	
	@Override
	public User findById(int id) {
		return userDAO.findById(id);
	}

}
