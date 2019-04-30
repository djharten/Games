import java.util.LinkedList;
import java.util.Queue;

public class Player {
	
	String name;
	Queue<Card> cards;
	Deck deck;
	
	public Player(String name, Deck deck) {
		this.name = name;
		this.deck = deck;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public int getDeckSize() {
		return cards.size();
	}
	
}
