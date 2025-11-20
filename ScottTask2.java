import java.util.Scanner;

public class ScottTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter first number: "); //prompt user to enter a first number
		int number1 = input.nextInt();
	//prompt user to enter another nunmber
		System.out.println("Enter second number: ");
		int number2 = input.nextInt();
		//prompt user to choose an operation
		System.out.println("Choose an operation (+, -, *, /): ");
		char operation = input.next().charAt(0);
		
		double result;
		
		switch (operation) { //set the conditional statements
		
		case '-':
			result = number1 - number2;
			System.out.println("Result: " + result);
			break;
			
		case '+':
			result = number1 + number2;
			System.out.println("Result: " + result);
			break;
			
		case '*':
			result = number1 * number2;
			System.out.println("Result: " + result);
			break;
			
		case '/':
			result = (number2 == 0) ? Double.POSITIVE_INFINITY : number1 / number2;
			System.out.println("Result: " + result);
			break;
			
		default:
			System.out.println("Invalid operation"); //set the default response to invalid inputs
		}
	}
}
