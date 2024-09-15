package Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//b.     Deck
//i.     Fields
//	1.     cards (List of Card):

	public class Deck {
	List<Card> cards = new ArrayList<Card>();

	Deck() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };

		for (String suit : suits) {
			int count = 2; // start counter at 2, go to 14
			for (String number : numbers) { // nested for loop- for every string number in numbers
				Card card = new Card(number, suit, count); // instantiate a new card for each card we want to create,
															// pass in the number, suit, count
				this.cards.add(card); // put newly instantiated card in the cards field
				count++; // creates our deck

			}
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void describeDeck () {
		for (Card card : this.cards) {
			card.describe(card);
			System.out.println(card.describe(card));
		}
		}

//		ii.    Methods
//			1.     shuffle (randomizes the order of the cards)

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

//			2.     draw (removes and returns the top card of the Cards field)
		
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
//			3.     In the constructor, when a new Deck is instantiated, the Cards field should be 
//					populated with the standard 52 cards.
																			//Done!

}
