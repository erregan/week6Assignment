package Week6;


public class Card {
	
	String name; // name field (contains a String name of the card representing values and suits e.g. Two of Spades)
	String suit; //	suit field (contains a String suit of the card representing suits diamonds, hearts, spades, clubs)
	int value;   //	value field for comparing against other cards (contains a value from 2-14 representing cards 2-Ace)
	
	public Card(String name, String suit, int value){
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String describe(Card card) {
		
		return(this.name + " of " + this.suit + "--" + this.value);
}

}
