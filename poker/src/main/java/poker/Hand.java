package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
	private List<Card> cardList = null;

	
	public Hand(String card1, String card2, String card3, String card4, String card5) {
		cardList = new ArrayList<Card>();
		
		cardList.add(new Card(card1));
		cardList.add(new Card(card2));
		cardList.add(new Card(card3));
		cardList.add(new Card(card4));
		cardList.add(new Card(card5));
		
		Collections.sort(cardList);
	}

	
	
	public HandComparation compare(Hand other) {
		HandComparation result = new HandComparation();
		
		Card otherHigherCard = other.getHigherCard();
		Card selfHigherCard = this.getHigherCard();
		
		result.setWinner(selfHigherCard.isHigher(otherHigherCard));
		
		return result;
	}

	private Card getHigherCard() {
		return cardList.get(cardList.size()-1);
	}
	
}
