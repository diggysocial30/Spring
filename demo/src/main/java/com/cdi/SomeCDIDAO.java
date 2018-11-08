package com.cdi;

import org.springframework.stereotype.Component;

@Component
public class SomeCDIDAO {

	public int[] getData(){
		return new int[]{1,2,3,4};
	}
}
