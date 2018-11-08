package com.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestSomeCDIBusiness {
	
	@InjectMocks
	SomeCDIBusiness mockCDIBusiness;
	
	@Mock
	SomeCDIDAO mockCDIDao;

	@Before
	public void setUp() throws Exception {
		mockCDIBusiness.setDao(mockCDIDao);
	}

	@Test
	public void test() {
		when(mockCDIBusiness.getDao().getData()).thenReturn(new int[]{1,2,3});
		assertEquals(mockCDIBusiness.fetchGreatest(),3);
	}
	
	@Test
	public void test2() {
		when(mockCDIBusiness.getDao().getData()).thenReturn(new int[]{1,2});
		assertEquals(mockCDIBusiness.fetchGreatest(),2);
	}

}
