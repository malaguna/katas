package poker;

import java.util.HashMap;
import java.util.Map;

public enum Value {
	TWO('2', 2),
	THREE('3',3),
	FOUR('4',4),
	FIVE('5',5),
	SIX('6',6),
	SEVEN('7',7),
	EIGHT('8',8),
	NINE('9',9),
	TEN('T',10),
	JEY('J',11),
	QUEEN('Q',12),
	KING('K',13),
	ACE('A',14)
	;
	
	private char desc;
	private int value;
	
	private static final Map<Character, Value> lookup = new HashMap<Character, Value>();
	
	static{
		for (Value item : Value.values()) {
			lookup.put(item.desc, item);
		}
	}

	Value(char desc, int value){
		this.desc = desc;
		this.value = value;
	}

	public static Value get(char value){
		return lookup.get(value);
	}

	public char getDesc() {
		return desc;
	}

	public int getValue() {
		return value;
	}

	public int compare(Value other){
		return this.value - other.value;
	}
}
