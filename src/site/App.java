package site;

import java.util.Arrays;

import java.util.List;

public class App {

	public static void main(String[]args){
		Player p1 = new Player();
		Player p2 = new Player();
		List<Player> players = Arrays.asList(p1, p2);
		
		LetterGameEngine engine = new LetterGameEngine(p1, p2);
		engine.run();
	}

}
