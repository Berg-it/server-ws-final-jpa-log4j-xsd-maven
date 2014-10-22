package com.bergit.webservice.assembler;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bergit.webservice.model.User;
import com.bergit.webservice.schemas.user.LoginResponse;
import com.bergit.webservice.schemas.user.RegisterUserStatusType;



@Component("userassembler")
public class UserAssembler {
	
	private static final Logger logger = Logger.getLogger(UserAssembler.class);
	
	public LoginResponse fromOnlineTransferObject(User user)
	{
		logger.info("Invoke Assembler fromOnlineTransferObject merthode");
		 
		LoginResponse response = new LoginResponse();
		if(user==null)
		{
			response.setStatus(RegisterUserStatusType.WRONG_DATA);
		}
		else
		{
			response.setStatus(RegisterUserStatusType.SUCCESS);
			response.setEmail(user.getEmail());
			response.setRole(user.getRole());
		}
		
		return response;
	}

}
