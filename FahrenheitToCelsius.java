	import java.util.Scanner;// Scanner is in the java.util package

	public class FahrenheitToCelsius {
	public static void main(String[] args) {

		//Create a scanner object
		Scanner input = new Scanner(System.in);
		//prompt user to enter a value in fahrenheit
		System.out.print(" Enter a temperature in Fahrenheit:");
		double fahrenheit = input.nextDouble();
		
		
		//compute temperature in celsius
		double celsius = ( 5.0 / 9 ) * (fahrenheit - 32);
		System.out.println("");
		System.out.println(" The temperature in Celsius is: " + celsius);
	}
	}

