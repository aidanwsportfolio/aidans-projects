import java.util.Scanner;

public class ScottTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter item 1 name: "); //prompt user to enter the first item name
		String item1 =  input.nextLine();
		
		System.out.println("Enter quantity: "); //prompt user to enter the quantity for the first item
		int quantity1 = input.nextInt();
		input.nextLine(); //clear buffer
		
		System.out.println("Enter price per unit: "); //prompt user to enter the price of the first item
		double price1 = input.nextDouble();
		input.nextLine(); //clear buffer
		
		// the next lines will repeat the above but for items 2

		System.out.println("Enter item 2 name: "); 
		String item2 = input.nextLine();
		
		System.out.println("Enter quantity: "); 
		int quantity2 =  input.nextInt();
		
		System.out.println("Enter price per unit: "); 
		double price2 =  input.nextDouble();
		input.nextLine();
		//item 3 below
		
		System.out.println("Enter item 3 name: "); 
		String item3 = input.nextLine();

		
		System.out.println("Enter quantity: "); 
		int quantity3 =  input.nextInt();
		input.nextLine(); //clear buffer
		
		System.out.println("Enter price per unit: "); 
		double price3 =  input.nextDouble();
		
		//below is the output code
		
		double total1 = quantity1 * price1;
		double total2 = quantity2 * price2;
		double total3 = quantity3 * price3;
		double subtotal = total1 + total2 + total3;
		
		System.out.println("----------------------------------------------------------");
		System.out.printf("%20s%20s%20s\n","Grocery", "Store","Receipt"); //print the top row of the receipt
		System.out.println("----------------------------------------------------------");
		System.out.printf("%-15s%-10s%-15s%-20s\n", "Item", "Quantity", "Unit Price", "Total"); //print second row
		System.out.printf("%-15s%-10d%-15.2f%-45.2f\n", item1, quantity1, price1, total1);
		System.out.printf("%-15s%-10d%-15.2f%-45.2f\n", item2, quantity2, price2, total2);
		System.out.printf("%-15s%-10d%-15.2f%-45.2f\n", item3, quantity3, price3, total3);
		System.out.println("----------------------------------------------------------");
		System.out.printf("%-20s%10.2f\n", "Subtotal:", subtotal);
		System.out.printf("%-20s%10.2f\n", "Tax:", subtotal * .0825);
		System.out.printf("%-20s%10.2f\n", "Total:", subtotal * .0825 + subtotal);
		System.out.println("----------------------------------------------------------");
		System.out.printf("%-15s%-10s%-10s%-15s%-10s%-5s\n", "Thank", "you", "for", "shopping", "with", "us!");
		
		

	}

}
