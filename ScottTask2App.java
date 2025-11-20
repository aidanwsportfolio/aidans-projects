import java.util.Scanner;

public class DeckApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize the shared deck once
        DeckOperations.initializeDeck();

        boolean keepRunning;
        do {
            // Ask user how many cards to draw 
            int numCards = 0;
            while (true) {
                System.out.print("How many cards would you like to draw? (1–52): ");
                if (input.hasNextInt()) {
                    numCards = input.nextInt();
                    input.nextLine(); // consume newline
                    if (numCards >= 1 && numCards <= 52) {
                        break;
                    } 
                    else {
                        System.out.println("Please enter a number between 1 and 52.");
                    }
                } 
                else {
                    System.out.println("Please enter a valid integer.");
                    input.nextLine(); // discard invalid tokens
                }
            }
            
            int[] drawn = DeckOperations.drawCards(numCards);
            System.out.println("\nYou drew " + numCards + " Card(s):");
            for (int cardNumber : drawn) {
            System.out.println("Card " + cardNumber + ": " + DeckOperations.getCardDescription(cardNumber));
           }
           System.out.println();
           
           //continue until user chooses to exit
           
          System.out.println("Draw again? (y/n): ");
          String answer = input.nextLine().trim().toLowerCase();
          keepRunning = answer.startsWith("y");
        }
        while (keepRunning);
        
        System.out.println("Goodbye!");
        input.close();
}
}

