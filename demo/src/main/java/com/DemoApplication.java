package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.diggysocial30.springbasics.demo.BinarySearchImpl;

/*Removed the spring boot configurations
*/
@Configuration
@ComponentScan
public class DemoApplication {

	/*
	 * what are beans ? what are the dependency of a bean ? where to search for
	 * the beans ?
	 */

	private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class)) {

			// Spring Applicaton context will manage all the beans

			BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);

			// Default scope of a bean: singleton
			// Same bean is returned each time
			// binarySearch== binarySearch1;
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			int result = binarySearch.binarySearch(new int[] { 1, 2, 4 }, 4);
			System.out.println(result);
			
			LOGGER.info("**********YAYYY******************");
		}

	}
}
