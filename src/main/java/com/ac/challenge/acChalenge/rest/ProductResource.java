package com.ac.challenge.acChalenge.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/product")
public class ProductResource {

	@GET
	@Produces("application/json")
	public String test(){
		return "ok";
	}
	
}
