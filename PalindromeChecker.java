import java.util.Scanner;

public class ScottTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String word = input.nextLine(); 
		
		String s = word.toLowerCase().replaceAll(" ", ""); //convert string to lowercase and remove spaces
		
		//pointers below
		int low = 0;
		int high = s.length() - 1;
		boolean isPalindrome = true;
		
		
		//while loop logicn
		while (low > high) { 
			if(s.charAt(high) != s.charAt(low)) {
				isPalindrome = false;
				break;
			}
		}
		
		low++;
		high--;
		
		//print results
		  if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } 
		  else {
	            System.out.println("The string is not a palindrome.");
	        }
	}

}
