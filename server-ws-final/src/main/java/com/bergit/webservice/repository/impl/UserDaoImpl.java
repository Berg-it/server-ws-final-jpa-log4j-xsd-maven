package com.bergit.webservice.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bergit.webservice.assembler.UserAssembler;
import com.bergit.webservice.model.User;
import com.bergit.webservice.repository.UserDao;
import com.bergit.webservice.schemas.user.LoginRequest;
import com.bergit.webservice.schemas.user.LoginResponse;

@Repository  
public class UserDaoImpl  implements UserDao  {

	private static final Logger logger = Logger.getLogger(UserDao.class);
	
	@Autowired
	UserAssembler userAssembler;
	
	@PersistenceUnit
    private EntityManagerFactory emf;
	
	@Override
	public User getUserDetails(String userId) {
		logger.info("call to repository: getUserDetails");
		
		return null;
	}

	@Override
	public String saveUserDetails(User user) {
		logger.info("call to repository: saveUserDetails");
		return null; 
	}

	@Override
	public LoginResponse authFunction(LoginRequest request) {
		logger.info("Invoke User Dao Implemenation,authFunction");
		String sql = "SELECT * FROM user u WHERE u.LOGIN=:LOGIN and u.PASSWORD=:PASSWORD";
		EntityManager em = emf.createEntityManager();
		Query query = em.createNativeQuery(sql, User.class);
		query.setParameter("LOGIN", request.getEmail());
		query.setParameter("PASSWORD", request.getPassword());
		User user = null;
		try{
			user = (User) query.getSingleResult();
		   }
		catch (NoResultException nre) {
			logger.info("Login or password are wrong. Please verify again with correct data, or contact us by mail. Thnaks");
		}
		LoginResponse response = userAssembler.fromOnlineTransferObject(user);
		return response;
	}


}
