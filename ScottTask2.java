import java.util.Scanner;

public class ScottTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner input for program
		System.out.println("Enter a Year: "); //prompt user to enter a year
		int year = input.nextInt(); //signal to program that the number entered is to be scanned

		
		/* These next few (or really a lot more than few) lines of code are the computations of the
 * chinese zodiac signs in accordance to any year possible. It's divided by 12 because there
 * are 12 months in a year, and in each new segment, the far right number increases by "1" per value.
 * AND, if by chance you end up on the "Pig!" zodiac sign, there's a special treat for you. (Just enter 2007)
 */
		if (year % 12 == 0) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Monkey!");
		}

		if (year % 12 == 1) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Rooster!");
		}
		
		if (year % 12 == 2) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Dog!");
		}
		
		if (year % 12 == 3) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Pig!");
			System.out.println(" I'm also of the Pig zodiac sign because I was born in 2007. Sensational sign and sensational year, truly, oink. Have a blessed day my Friend!");
		}
		
		if (year % 12 == 4) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Rat!");
		}
		
		if (year % 12 == 5) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Ox!");
		}
		
		if (year % 12 == 6) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Tiger!");
		}
		
		if (year % 12 == 7) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Rabbit!");
		}
		
		if (year % 12 == 8) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Dragon!");
		}
		
		if (year % 12 == 9) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Snake!");
		}
		
		if (year % 12 == 10) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Horse!");
		}
		
		if (year % 12 == 11) {
			System.out.println(" The Chinese Zodiac Sign for " + year + " is: Sheep!");
		}
	}
}
