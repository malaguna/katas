package poker;

public class HandComparation {

	public static final Object HIGHER_CARD = "Higher Card Wins";
	private boolean winner = false;

	public boolean isWinner() {
		return winner;
	}

	public Object getReason() {
		// TODO Auto-generated method stub
		return String.format("%s - %s", HandComparation.HIGHER_CARD, Card.ACE);
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

}
