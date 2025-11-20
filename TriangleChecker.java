import java.util.Scanner;

public class ScottTask3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the three sides of the triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if ( a+b>c && a+c>b && b+c>a) {
		
			if (a==b && b==c){
				System.out.println("This is an Equilateral Triangle");
			}
			if(a==b || a==c || b==c) {
				System.out.println("This is an Isosceles Triangle");
			}
			else {
				System.out.println("This is a Scalene Triangle");
			}
		}
		else {
			System.out.println("Invalid Triangle Sides!");
		}
	}
}
