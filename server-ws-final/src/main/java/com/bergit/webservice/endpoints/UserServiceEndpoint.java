package com.bergit.webservice.endpoints;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bergit.webservice.schemas.user.AuthentificationServiceUserRequest;
import com.bergit.webservice.schemas.user.AuthentificationServiceUserResponse;
import com.bergit.webservice.schemas.user.RegisterServiceUserRequest;
import com.bergit.webservice.schemas.user.RegisterServiceUserResponse;
import com.bergit.webservice.service.impl.UserServiceImpl;


@Endpoint  
public class UserServiceEndpoint {
	
	 private static final Logger logger = Logger.getLogger(UserServiceEndpoint.class);
	 private static final String USER_TARGET_NAMESPACE="http://www.bergit.com/webservice/schemas/user";

	 @Autowired  
	 private UserServiceImpl userService;  
	 
	 @PayloadRoot(localPart = "AuthentificationServiceUserRequest", namespace = USER_TARGET_NAMESPACE)    
     public @ResponsePayload AuthentificationServiceUserResponse wsAuth(@RequestPayload AuthentificationServiceUserRequest request)      
     {    
		   logger.info("call to ENDPOINT: GetUserResponse");
		   AuthentificationServiceUserResponse response = new AuthentificationServiceUserResponse();
		   response.setResponse(userService.authFunction(request.getRequest()));
  		   return response;
     }   
	 
	 @PayloadRoot(localPart = "RegisterServiceUserRequest", namespace = USER_TARGET_NAMESPACE)    
     public @ResponsePayload RegisterServiceUserResponse wsAuth(@RequestPayload RegisterServiceUserRequest request)      
     {    
		   logger.info("call to ENDPOINT: RegisterServiceUserRequest");
  		   return null;
     }   
	 
}
