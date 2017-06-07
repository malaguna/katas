package poker;

import junit.framework.TestCase;

public class PokerTest extends TestCase {

	public void testHigherCard(){
		String winFormat = "%s - %s";
		
		Hand black = new Hand("2C", "4S", "3D", "5H", "7H");
		Hand white = new Hand("AC", "QS", "TC", "2H", "9H");
		
		HandComparation result = white.compare(black);
		
		assertTrue(result.isWinner());
		assertEquals(String.format(winFormat, HandComparation.HIGHER_CARD, Card.ACE), result.getReason());
	}
	
	public void testReverseHigherCard(){
		String winFormat = "%s - %s";
		
		Hand black = new Hand("2C", "4S", "3D", "5H", "7H");
		Hand white = new Hand("AC", "QS", "TC", "2H", "9H");
		
		HandComparation result = black.compare(white);
		
		assertFalse(result.isWinner());
		assertEquals(String.format(winFormat, HandComparation.HIGHER_CARD, Card.ACE), result.getReason());
	}

}
