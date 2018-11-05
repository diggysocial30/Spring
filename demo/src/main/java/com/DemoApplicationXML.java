package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.xml.XMLJDBCConnection;
import com.jdbc.xml.XMLPersonDAO;

/*Removed the spring boot configurations
*/
@Configuration
public class DemoApplicationXML {

	/*
	 * what are beans ? what are the dependency of a bean ? where to search for
	 * the beans ?
	 */

	private static Logger LOGGER = LoggerFactory.getLogger(DemoApplicationXML.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XMLPersonDAO xmlPersonDAO=context.getBean(XMLPersonDAO.class);
			XMLJDBCConnection xmlJDBC=xmlPersonDAO.getJdbcConnection();

			LOGGER.info(xmlJDBC.toString());
			
			LOGGER.info("**********YAYYY******************");
		}

	}
}
