package Bag;

import java.util.Random;

import domaine.Letter;

public class LetterBag {
	
	private Random random = new Random();
	
	public Letter getNextLetter(){
		return Letter.valueOf((char)('a' + random.nextInt(26)));
	}
}
