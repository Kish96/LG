package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import site.InfiniteIterator;

public class InfiniteIteratorTest {

	@Test
	public void infiniteTest(){
		ArrayList<Integer> testSample = new ArrayList<>();
		testSample.add(1);
		testSample.add(2);
		testSample.add(3);
		InfiniteIterator<Integer> infiniteIterator = new InfiniteIterator<Integer>(testSample);
		int result = 0;
		for (int i =0; i< 4; i++){
			assertTrue(infiniteIterator.hasNext());
			result = infiniteIterator.next();;
		}
		assertEquals(1, result);
		
	}
}
