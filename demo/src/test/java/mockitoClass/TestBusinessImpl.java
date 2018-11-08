package mockitoClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBusinessImpl {
	
	BusinessImpl businessImpl=new BusinessImpl(new DataServiceStub());

	@Test
	public void testFetchReliableDataService() {
		int a=businessImpl.fetchReliableDataService();
		assertEquals(4,a);
	}

}

class DataServiceStub implements DataService{
	@Override
	public int[] retrieveAllData(){
		return new int[]{1,2,3,4};
	}
	
	
}