import java.util.Scanner;

public class ScottTask4 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);		
		System.out.println("Enter your lottery pick " + ("(two digits)") + ": ");//prompt user
		String a = input.nextLine();
				//generate lottery number as a string
		String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
		System.out.println("The lottery number is " + lottery);

		
		if (a.equals(lottery)) { //check for exact match
			System.out.println("Exact Match: you win $10,000");
		}//check if 2 digits match
			else if (a.charAt(0) == lottery.charAt(1) && a.charAt(1) == lottery.charAt(0)) {
				System.out.println("Match all Digits: you win $3,000");
		}//check if one digit matches
			else if (lottery.contains(a.substring(0,1)) || lottery.contains(a.substring(1,2))) {
				System.out.println("Match one Digit: you win $1,000");
			}
			else { //no match
				System.out.println("Sorry, no match");
	}
	}
}
