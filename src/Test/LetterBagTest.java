package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Bag.LetterBag;

import java.util.HashSet;
import java.util.Set;

import domaine.Letter;

public class LetterBagTest {

	@Test
	public void test(){
		LetterBag bag = new LetterBag();
		Set<Letter> result = new HashSet<Letter>();
		for(int i = 0; i < 10000; i++){
			result.add(bag.getNextLetter());
		}
		assertEquals(26,result.size());
	}
	
}
