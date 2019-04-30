
public class Card {
	String card;
	int cardNum;
	String[] suits = { "Clubs" ,"Spades" ,"Diamonds","Hearts" };
	String[] values = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	
	Card(int suit, int value) {
		this.card = values[value] + " of " + suits[suit];
	}
	
	public String printCard() {
		return this.card;
	}
	
}
