package Week6;

import java.util.ArrayList;
import java.util.List;

//2. Create a class called App with a main method.

public class App {
	public static void main(String[] args) {
		Player playerOne = new Player();
		Player playerTwo = new Player();

		Deck deck = new Deck();

// 		Describe card

		Card card = new Card("Two", "Spades", 2);
		System.out.println("Testing card class- describe a card:");
		System.out.println(card.describe(card));
	

//a. Instantiate a Deck and two Players, call the shuffle method on the deck.

		deck.shuffle();
		System.out.println();

//		b.     Using a traditional for loop, iterate 52 times calling the Draw 
//				method on the other player each iteration using the Deck you instantiated.
		List<Card> playerOneCards = new ArrayList<Card>();
		List<Card> playerTwoCards = new ArrayList<Card>();

		for (int i = 0; i < 52; i++) {
			boolean player1 = i % 2 == 0;
			if (player1) {
				Card drawnCard = deck.draw();
				playerOneCards.add(drawnCard);
			} else {

				Card drawnCard2 = deck.draw();
				playerTwoCards.add(drawnCard2);
			}

		}

		Deck playerOneDeck = new Deck();
		playerOneDeck.setCards(playerOneCards);
		playerOneDeck.shuffle();
		Deck playerTwoDeck = new Deck();
		playerTwoDeck.setCards(playerTwoCards);
		playerTwoDeck.shuffle();

		// object.method()
		// object.property()

		playerOne.setHand(playerOneCards);
		playerTwo.setHand(playerTwoCards);
		System.out.println("Let's play WAR");

//		c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.

		for (int i = 0; i < 26; i++) {
			Card flippedCard = playerOne.flip(playerOneDeck);
			Card flippedCard2 = playerTwo.flip(playerTwoDeck);

			if (flippedCard.getValue() > flippedCard2.getValue()) {

				playerOne.incScore();
				System.out.println("Player 1");

			} else if (flippedCard.getValue() < flippedCard2.getValue()) {

				playerTwo.incScore();
				System.out.println("Player 2");

			} else {
				System.out.println("Tie");

			}
		}
		System.out.println();

//			Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method 
//			on the player whose card has the higher value.  Print a message to say which player received a point.
//			Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.

//		d.      After the loop, compare the final score from each player.

			int score = playerOne.getScore();
			int score2 = playerTwo.getScore();

//		e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on 
//				which score is higher or if they are both the same.

			if (score > score2) {
				System.out.println("Player 1 wins with a score of " + score);

			} else if (score2 > score) {
				System.out.println("Player 2 wins with a score of " + score2);

			} else {
				System.out.println("Draw, tied at " + score);

			}
			
			System.out.println("Player 1 score: " + score);
			System.out.println("Player 2 score: " + score2);
			
			// 3. Tips: Printing out information throughout the game adds value including
			// easier debugging as you progress and a
//					better user experience.

//			a.  Using the Card describe() method when each card is flipped illustrates the game play.

//			b.  Printing the winner of each turn adds interest -- or a message indicating a tie.
//			c.  Printing the updated score after each turn shows game progression.
//			d.  At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.

		} // End of main method

	}
