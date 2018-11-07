package com.diggysocial30.springbasics.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		// Logic for bubble sort
		return numbers;
	}
		

}
