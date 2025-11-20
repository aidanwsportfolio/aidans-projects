import java.util.Scanner;

public class ScottTask2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int randomNumber = (int)(Math.random() * 100) + 1; 

        int guess = -1; 

        while (guess != randomNumber) {
            System.out.println("Guess a number between 1 and 100:"); //prompt the user to guess a number
            guess = input.nextInt(); 
            count++;
            
            if (guess > randomNumber) { //below is the logic behind the too high or too low's
                System.out.println("Too high. Try Again.\n______________________________________________");
            } 
            else if (guess < randomNumber) {
                System.out.println("Too low. Try again.\n_______________________________________________");
            } 
            else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + count + " attempts.");
            }
        }
    }
}