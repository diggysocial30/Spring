package com;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.diggysocial30.springbasics.demo.BinarySearchImpl;
import com.jdbc.PersonDAO;

import scan.SDAO;


/*SpringBootApplication scans for the cpmponents and the dependencies
*/

@SpringBootApplication
@ComponentScan({"scan","com.diggysocial30.springbasics.demo","com.jdbc"})
public class DemoApplication {
	
	private static Logger LOGGER=LoggerFactory.getLogger(DemoApplication.class);

	/*what are beans ?
	what are the dependency of a bean ?
	where to search for the beans ?		*/
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		// Spring Applicaton context will manage all the beans
		
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);
		
		// Default scope of a bean: singleton
		// Same bean is returned each time
		//binarySearch== binarySearch1;
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result=binarySearch.binarySearch(new int[]{1,2,4}, 4);
		System.out.println(result);
		
		
		PersonDAO personDAO= context.getBean(PersonDAO.class);
		
		PersonDAO personDAO2= context.getBean(PersonDAO.class);
		SDAO sDAO2= context.getBean(SDAO.class);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO2);
		
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO2.getJdbcConnection());
	}
}
