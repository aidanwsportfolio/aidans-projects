import java.util.Scanner;

public class ScottTask1 {	
	public static void main(String[] args) {
	//Generate two random single-digit integers
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);
	
	//combine into a lottery number
	int lottery = number1 * 10 + number2;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		int answer = input.nextInt();
		
		//obtain the digits from the answer and reveal the answer
		int answerDigit1 = answer /10;
		int answerDigit2 = answer %10;
		System.out.println("The lottery number is: " + lottery);
		
		//checkk for rewards
		if (answer == lottery) {
			System.out.println("you win $10,000");
		}
		else if (answerDigit1 == number2 && answerDigit2 == number1) {
			System.out.println("you win $3,000");
		}
		else if (answerDigit1 == number1 || answerDigit1 == number2 ||
				answerDigit2 == number1 || answerDigit2 == number2) {
			System.out.println("you win $1,000");
		}
		else {
			System.out.println("Sorry, no match.");
		}
	}
}
