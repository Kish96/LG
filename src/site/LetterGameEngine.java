package site;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import Bag.LetterBag;
import domaine.Letter;

public class LetterGameEngine {

	private List<Letter> commonJar = new ArrayList<>();
	private List<Player> players;
	private LetterBag bag;
	
	public LetterGameEngine(List<Player> players, LetterBag bag){
		this.players = players;
		this.bag = bag;
	}
	
	public LetterGameEngine(Player p1, Player p2) {
		// TODO Auto-generated constructor stub
	}

	public void run(){
		initializeGame(players, bag);
	}
	
	private boolean isGameFinished(){
		Optional <List<Word>> optional = players.stream()
				.map(Player::getWords)
				.filter(words -> words.size() <= 10)
				.findAny();
		return optional.isPresent();
	}
	
	private Collection<Player> initializeGame(List<Player> players, LetterBag bag){
		Map<Letter, Player> firstLetters = 
				new TreeMap<>(new LetterComparator());
		players.forEach(p -> {
			Letter letter = bag.getNextLetter();
			commonJar.add(letter);
			firstLetters.put(letter, p);
		});
		return firstLetters.values();
	}

}
