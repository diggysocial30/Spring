package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ExternalProperties {

	// Read from external properties file : external.service.url
	@Value("${external.service.url}")
	private String url;
	
	public String fetchServiceURL(){
		
		return url;
	}
}
