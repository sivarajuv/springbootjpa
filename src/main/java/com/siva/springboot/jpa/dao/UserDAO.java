package com.siva.springboot.jpa.dao;

import com.siva.springboot.jpa.domain.User;

public interface UserDAO {
	
	User findById(int id);

}
