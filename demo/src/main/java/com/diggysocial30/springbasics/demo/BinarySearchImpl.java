package com.diggysocial30.springbasics.demo;

public class BinarySearchImpl { 
	
	private SortAlgorithm sortAlgo;
	
	 /*2 ways of dependency injection in Spring for loose coupling
	 1. Constructor Initialization
	 2. Setter methods*/
	
	public BinarySearchImpl(SortAlgorithm sortAlgo) {
		super();
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
