package mockitoClass;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestListInterface {
	@Mock
	List mockedList;

	@Before
	public void setUp() throws Exception {

		mockedList = mock(List.class);
		when(mockedList.size()).thenReturn(10).thenReturn(20);

	}

	@Test
	public void test() {
		assertEquals(10, mockedList.size());
		assertEquals(20, mockedList.size());
	}
	

	@Test
	public void testGet() {
		when(mockedList.get(0)).thenReturn("Yayyayya");
		assertEquals( "Yayyayya",mockedList.get(0));
		assertEquals(mockedList.get(1), null);
		
		when(mockedList.get(Mockito.anyInt())).thenReturn("Yayyayya");
		assertEquals(mockedList.get(5), "Yayyayya");
	}

}
