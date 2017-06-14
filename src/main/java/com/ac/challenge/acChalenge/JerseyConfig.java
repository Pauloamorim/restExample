package com.ac.challenge.acChalenge;

import org.glassfish.jersey.server.ResourceConfig;

import com.ac.challenge.acChalenge.rest.ProductResource;

public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(ProductResource.class);
	}
}
