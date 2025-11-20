
public class DeckSimulator {

	public static void main(String[] args) {

		int[] deck = new int[52]; //create deck array
		
		//initialize the deck with all card values
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
	
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; //declares, creates, and initializes suits array
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //declares, creates, and initializes ranks array
		
		//shuffle cards
		for (int i = deck.length - 1; i > 0; i--) {
			int j = (int)(Math.random() * (i + 1)); //random between 0 and i
			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
		//display the first four cards
		for (int i = 0; i < 4; i++) {
			int cardNumber = deck[i];
			String suit = suits[cardNumber / 13];
			String rank = ranks[cardNumber %13];
			System.out.println("Card " + cardNumber + ": " + rank + " of " + suit);
			
		}
	}

}
