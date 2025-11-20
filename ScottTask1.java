import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose conversion type: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();

            if (celsius < -273.15) {
                System.out.println("Invalid! Temperature is below absolute zero.");
            } 
            else {
                double fahrenheit = celsiusToFahrenheit(celsius);
                displayResult(choice, celsius, fahrenheit);
            }
        } 
        else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();

            if (fahrenheit < -459.67) {
                System.out.println("Invalid! Temperature is below absolute zero.");
            } 
            else {
                double celsius = fahrenheitToCelsius(fahrenheit);
                displayResult(choice, celsius, fahrenheit);
            }
        } 
        else {
            System.out.println("Invalid choice.");
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
    public static void displayResult(int choice, double celsius, double fahrenheit) {
    	if (choice == 1) {
    	System.out.println(celsius + "*C " + "= " + fahrenheit +"*F");	
    	}
    	else if (choice == 2) {
    		System.out.println(fahrenheit + "*F " + "= " + celsius +"*C");	
    	}
        
    }
}
