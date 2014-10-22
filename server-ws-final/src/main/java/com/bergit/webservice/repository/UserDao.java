package com.bergit.webservice.repository;

import com.bergit.webservice.model.User;
import com.bergit.webservice.schemas.user.LoginRequest;
import com.bergit.webservice.schemas.user.LoginResponse;

public interface UserDao {

	 public User getUserDetails(String userId);  
	 public String saveUserDetails(User user); 
	 
	 public LoginResponse authFunction(LoginRequest request);
	 
}
