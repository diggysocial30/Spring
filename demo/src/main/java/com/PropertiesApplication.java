package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:app.properties")
@ComponentScan
public class PropertiesApplication {
private static Logger LOGGER = LoggerFactory.getLogger(PropertiesApplication.class);

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(PropertiesApplication.class)) {

			// Spring Applicaton context will manage all the beans

			ExternalProperties service = context.getBean(ExternalProperties.class);
			
						
			LOGGER.info("**********YAYYY******************"+service.fetchServiceURL());
		}

	}
}
