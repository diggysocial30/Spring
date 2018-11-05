package com.diggysocial30.springbasics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl { 
	
	@Autowired
	private SortAlgorithm sortAlgo;
	
	 /*2 ways of dependency injection in Spring for loose coupling
	 1. Constructor Initialization
	 2. Setter methods*/
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}*/

	public void setSortAlgo(SortAlgorithm sortAlgo) {
		this.sortAlgo = sortAlgo;
	}

	//1. Sort an array
	//2. Search in it
	//3. Return it
	
	
	public int binarySearch(int[] numbers,int numberToSearch){
		sortAlgo.sort(numbers);
		return numberToSearch;
	}
}
