package com.jdbc.xml;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.diggysocial30.springbasics.demo.BinarySearchImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/textContext.xml")
public class TestXMLPersonDAO {

	// Load the bean from context
	@Autowired
	BinarySearchImpl binarySearch;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(binarySearch.binarySearch(new int[] { 1, 22, 3 }, 2), 2);
	}

}
