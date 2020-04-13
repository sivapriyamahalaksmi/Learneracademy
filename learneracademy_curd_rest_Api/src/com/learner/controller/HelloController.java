package com.learner.controller;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/")
public class HelloController {
	
	@GET
	public String HelloSubject (){
			return ("Welcome to Learner Academy!!!!");}
	
	@PUT
	public String sayHelloPut()
	{
		return "Welcome to Learner Academy PUT METHOD !!!";
	}


}
