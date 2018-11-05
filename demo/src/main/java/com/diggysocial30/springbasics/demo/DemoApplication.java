package com.diggysocial30.springbasics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearch =new BinarySearchImpl(new BubbleSortAlgorithm());
		int result=binarySearch.binarySearch(new int[]{1,2,4}, 4);
		System.out.println(result);
	}
}
