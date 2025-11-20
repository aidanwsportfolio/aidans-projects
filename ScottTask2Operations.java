import java.util.Arrays;

public class DeckOperations {

	//shared data from last program
	   private static int[] deck = new int[52];
	    private static final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	    private static final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public static void initializeDeck() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
			}
	}
	
	public static void shuffleDeck() {
		for (int i = deck.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1)); 
			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
	}
	public static String getCardDescription(int cardNumber) {
        int suitIndex = cardNumber / 13; 
        int rankIndex = cardNumber % 13;
        return ranks[rankIndex] + " of " + suits[suitIndex];
    }
	
	public static int[] drawCards (int numCards) {
		if (numCards < 1 || numCards > 52) {
			throw new IllegalArgumentException("Number of cards must be between 1 and 52.");
		}
		
		shuffleDeck();
		return Arrays.copyOfRange(deck, 0, numCards);
	}
}
