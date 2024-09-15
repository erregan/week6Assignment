package Week6;

import java.util.ArrayList;
import java.util.List;


//i.     Fields

public class Player {

//	1.     hand (List of Card)

	List<Card> hand = new ArrayList<Card>();
	public List<Card> getHand() {
		return hand;
	}
	
	public List<Card> setHand(List<Card> hand) {
	return this.hand = hand; 
	
	}

	
	String playerName;
	int score = 0;

	
	
	
	
//	2.     score (set to 0 in the constructor)

	public void Card(int score) {
		this.score = score;

	}

	public int getScore() {
		return score;

	}

	public int setScore(int score) {
		return this.score = score;
	}

//	3.     name 

	public void Card(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void describe(Player player) {
		System.out.println(player.getPlayerName() + " has the following cards: ");
		System.out.println("*************************************");
		for (Card card : hand) {
			System.out.println(card.describe(card));
		}
	}



//ii.    Methods
//1.     describe (prints out information about the player and calls the describe method  
//			for each card in the Hand List)
	
	

//2.     flip (removes and returns the top card of the Hand)
	public Card flip(Deck deck) {
		return(deck.draw());
	}
	

//3.     draw (takes a Deck as an argument and calls the draw method on the deck, 
//			adding the returned Card to the hand field)
	
	
	

//4.     incrementScore (adds 1 to the Player’s score field)
	
	public void incScore() {
		this.setScore(this.getScore() + 1);
		
	}
	
	
	
	
}