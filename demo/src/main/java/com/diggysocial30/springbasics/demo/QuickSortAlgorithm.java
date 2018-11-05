package com.diggysocial30.springbasics.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

}
