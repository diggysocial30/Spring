package com.diggysocial30.springbasics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/*SpringBootApplication scans for the cpmponents and the dependencies
*/

@SpringBootApplication
public class DemoApplication {

	/*what are beans ?
	what are the dependency of a bean ?
	where to search for the beans ?		*/
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		// Spring Applicaion context will manage all the beans
		
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		int result=binarySearch.binarySearch(new int[]{1,2,4}, 4);
		System.out.println(result);
	}
}
