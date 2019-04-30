import java.util.Scanner;

public class War {

	public static void main(String[] args) {
		
		Deck fullDeck = new Deck();
		fullDeck.shuffleDeck();
		Deck playerOneDeck = new Deck(fullDeck);
		Deck playerTwoDeck = new Deck(fullDeck);
		Scanner sc = new Scanner(System.in);
		Player player1 = new Player(getPlayerName(sc), playerOneDeck);
		Player player2 = new Player(getPlayerName(sc), playerTwoDeck);
		playGame(playerOneDeck, playerTwoDeck);
	}
	
	public static String getPlayerName(Scanner sc) {
		System.out.print("Hello! Please enter your name: ");
		String name = sc.nextLine();
		return name;
	}
	
	public static void playGame(Deck playerOneDeck, Deck playerTwoDeck) {
		while(playerOneDeck.deckSize() > 0 && playerTwoDeck.deckSize() > 0) {
			String[] playerOneCard = playerOneDeck.getCard().printCard().split(" ");
			String[] playerTwoCard = playerOneDeck.getCard().printCard().split(" ");
			Card cardOne = playerOneDeck.getCard();
			Card cardTwo = playerTwoDeck.getCard();
			playerOneDeck.removeCard();
			playerTwoDeck.removeCard();
			// THIS DOES NOT WORK FOR J, Q, K or A - FIX
			int playerOneCardValue = Integer.parseInt(playerOneCard[0]);
			int playerTwoCardValue = Integer.parseInt(playerTwoCard[0]);
			if(playerOneCardValue > playerTwoCardValue) {
				System.out.println("Player One!");
				playerOneDeck.addCard(cardOne);
				playerTwoDeck.addCard(cardTwo);
			} else if(playerOneCardValue < playerTwoCardValue) {
				System.out.println("Player Two!");
				playerOneDeck.addCard(cardOne);
				playerTwoDeck.addCard(cardTwo);
			} else {
				// TODO - Tie? Check suits.
			}
			System.out.println(playerOneDeck.deckSize() + " " + playerTwoDeck.deckSize());
		}
	}

}