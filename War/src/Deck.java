import java.util.LinkedList;
import java.util.Queue;

public class Deck {
	
	Queue<Card> deck = new LinkedList<Card>();
	Card[] cards = new Card[52];
	
	Deck() {
		int cardNum = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <  13; j++) {
				cards[cardNum] = new Card(i, j);
				cardNum++;
			}
		}
	}
	
	Deck(Deck fullDeck){
		for(int i = 0; i < 26; i++) {
			Card card = fullDeck.getCard();
			fullDeck.removeCard();
			this.deck.add(card);
		}
	}
	
	public Card getCard() {
		return deck.peek();
	}
	
	public void removeCard() {
		deck.poll();
	}
	
	public void addCard(Card card) {
		deck.add(card);
	}
	
	public int deckSize() {
		return deck.size();
	}
	
	public void shuffleDeck() {
		for(int i = 0; i < 5000; i++) {
			int firstCard = (int) (Math.random()*52);
			int secondCard = (int) (Math.random()*52);
			Card tempCard =  cards[firstCard];
			cards[firstCard] = cards[secondCard];
			cards[secondCard] = tempCard;
		}
		for(Card c : cards) {
			deck.add(c);
		}
	}
	
}