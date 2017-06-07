package poker;

import java.util.HashMap;
import java.util.Map;

public enum Suit {
	DIAMONDS('D', "Diamonds"),
	CLUBS('C', "Clubs"),
	HEARTS('H', "Hearts"),
	SPADES('S', "Spades")
	;
	
	public char getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	private char value; 
	private String description;
	private static final Map<Character, Suit> lookup = new HashMap<Character, Suit>();
	
	static{
		for (Suit item : Suit.values()) {
			lookup.put(item.value, item);
		}
	}
	
	Suit(char value, String description){
		this.value = value;
		this.description = description;
	}
	
	public static Suit get(char value){
		return lookup.get(value);
	}
}
