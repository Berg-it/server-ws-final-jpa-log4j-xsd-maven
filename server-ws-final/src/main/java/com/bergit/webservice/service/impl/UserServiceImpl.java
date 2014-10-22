package com.bergit.webservice.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bergit.webservice.model.User;
import com.bergit.webservice.repository.UserDao;
import com.bergit.webservice.schemas.user.LoginRequest;
import com.bergit.webservice.schemas.user.LoginResponse;
import com.bergit.webservice.service.UserService;


@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = Logger.getLogger(UserService.class);
	
	 @Autowired  
	 private UserDao userDao;

	 @Override
	public User getUserDetails(String userId) {
		logger.info("call to SERVICE: getUserDetails");
		return userDao.getUserDetails(userId);  
	}

	 @Override
	public String saveUserDetails(User user) {
		logger.info("call to SERVICE: saveUserDetails");
		return userDao.saveUserDetails(user);  
	}  
	 

	@Override
	public LoginResponse authFunction(LoginRequest request) {
		logger.info("call to SERVICE: authFunction");
		return userDao.authFunction(request); 
	} 
	 
	
	
	public void setUserDao(UserDao userDao) {  
		  this.userDao = userDao;  
		 }

}
