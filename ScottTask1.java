import java.util.Scanner; //imports the scanner utility into the project

public class ScottTask1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //create input scanner for program 
		System.out.println("Enter an integer: "); //Prompt the user to enter an integer
		int number = input.nextInt(); //Indicate to program the the entered number is the integer to be scanned
		
		if(number > 0) { //Check to see if number is positive
		System.out.println("The Number is positive");
		
		if (number % 5 == 0) { //Check if the positive number is divisible by five
			System.out.println("The Number is Divisible by five");
			}
		}
		if(number == 0) { //Check to see if the number is zero
		System.out.println("The Number is zero");
		
		}
		if(number < 0) { //Check to see if the number is negative
		System.out.println("The Number is negative");
		}
		
		if(number % 2 == 0) { //Check to see if the number is even
		System.out.println("The Number is even");
		}
		else { //Check to see if the number is odd
			System.out.println("The Number is odd");
		}
		
	}

}
