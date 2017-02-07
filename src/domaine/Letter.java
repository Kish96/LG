package domaine;

import java.util.HashMap;
import java.util.Map;

public class Letter {

	private final char c;
	private Map<Character, Letter> letters = new HashMap<>();
	
	private Letter(char c){
		this.c = c;
	}
	
	public Character getChar(){
		return c;
	}
	
	public static Letter valueOf(char c) {
		
		return new Letter(c);
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + c;
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (this == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		if (c != other.c)
			return false;
		return true;
	}

	public Map<Character, Letter> getLetters() {
		return letters;
	}

	public void setLetters(Map<Character, Letter> letters) {
		this.letters = letters;
	}

}
