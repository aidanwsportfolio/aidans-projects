import java.util.Scanner;

public class ScottTask2 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter side a: "); //prompt user to enter a side length
		double a = input.nextDouble();
		System.out.println("Enter side b: "); //prompt user to enter a side length
		double b = input.nextDouble();
		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); //calculate the hypotenuse
		System.out.println("Hypotenuse: " + c);
	
		System.out.println(); // make space
		
		double A = Math.toDegrees(Math.atan(a/b)); //calculate angle A
		System.out.println("Angle A: " + A + " degrees");
		
		System.out.println(); //make space 
		
		double B = 90 - A; //calculate angle B
		System.out.println("Angle B: " + B + " degrees");
		
	}

}
