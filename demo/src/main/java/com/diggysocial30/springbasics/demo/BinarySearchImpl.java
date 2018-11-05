package com.diggysocial30.springbasics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/*5 types of bean scopes are supported :

Singleton : It returns a single bean instance per Spring IoC container.This single instance is stored in a cache of such singleton beans, and all subsequent requests and references for that named bean return the cached object.If no bean scope is specified in bean configuration file, default to singleton.

Prototype : It returns a new bean instance each time when requested. It does not store any cache version like singleton.

Request : It returns a single bean instance per HTTP request.

Session : It returns a single bean instance per HTTP session (User level session).

GlobalSession : It returns a single bean instance per global HTTP session. It is only valid in the context of a web-aware Spring ApplicationContext (Application level session).

In most cases, you may only deal with the Spring’s core scope – singleton and prototype, and the default scope is singleton.*/

@Component
public class BinarySearchImpl { 
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgo;
	
	 /*2 ways of dependency injection in Spring for loose coupling
	 1. Constructor Initialization
	 2. Setter methods*/
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}

	public void setSortAlgo(SortAlgorithm sortAlgo) {
		this.sortAlgo = sortAlgo;
	}*/

	//1. Sort an array
	//2. Search in it
	//3. Return it
	
	
	public int binarySearch(int[] numbers,int numberToSearch){
		sortAlgo.sort(numbers);
		return numberToSearch;
	}
}
