package mockitoClass;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class TestMockAnnotationsBusinessImpl {
	
	static BusinessImpl businessImpl=null;
	
	@BeforeClass
	public static void mockDataService(){
		DataService mock =Mockito.mock(DataService.class);
		businessImpl=new BusinessImpl(mock);
		
	}

	@Test
	public void testFetchReliableDataService() {
		when(businessImpl.dataService.retrieveAllData()).thenReturn(new int[]{1,2,3,4});
		int a=businessImpl.fetchReliableDataService();
		assertEquals(4,a);
	}

	@Test
	public void testFetchReliableDataService2() {
		when(businessImpl.dataService.retrieveAllData()).thenReturn(new int[]{1,2,3,4,10});
		int a=businessImpl.fetchReliableDataService();
		assertEquals(10,a);
	}
}

