package poker;

public class Card implements Comparable<Card>{
	public static final Object ACE = "Ace";
	
	private Suit suit = null;
	private Value value = null;

	public Card(String card1) {
		this(card1.charAt(0), card1.charAt(1));
	}

	public Card(char value, char suit) {
		this.suit = Suit.get(suit);
		this.value = Value.get(value);
	}

	public int compareTo(Card other) {
		return this.value.compare(other.value);
	}

	public boolean isHigher(Card other) {
		return this.compareTo(other) >= 0;
	}

}
