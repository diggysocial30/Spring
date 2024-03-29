package mockitoClass;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestMockBusinessImpl {
	
	
	@InjectMocks
	static BusinessImpl businessImpl;
	@Mock
	static DataService dataServiceMock;
	
	@BeforeClass
	public static void mockDataService(){
		businessImpl=new BusinessImpl(dataServiceMock);
		
	}

	@Test
	public void testFetchReliableDataService() {
		when(businessImpl.dataService.retrieveAllData()).thenReturn(new int[]{1,2,3,4});
		assertEquals(4,businessImpl.fetchReliableDataService());
	}

	@Test
	public void testFetchReliableDataService2() {
		when(businessImpl.dataService.retrieveAllData()).thenReturn(new int[]{1,2,3,4,10});
		assertEquals(10,businessImpl.fetchReliableDataService());
	}
}

