import java.util.Scanner;

public class ScottTask1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do { //to accompany the while loop, making sure it's done at least once before the while loop
            //Show the menu
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) { //if choice is or between 1 and 4
                System.out.print("Enter first number: "); //prompt users
                double number1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double number2 = input.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (number1 + number2) + "\n");
                        break;
                    case 2:
                        System.out.println("Result: " + (number1 - number2) + "\n");
                        break;
                    case 3:
                        System.out.println("Result: " + (number1 * number2) + "\n");
                        break;
                    case 4:
                        if (number2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.\n");
                        } 
                        else {
                            System.out.println("Result: " + (number1 / number2) + "\n");
                        }
                        break;
                }
            } else if (choice != 5) {//tells user that input is invalid if they try to divide by 0
                System.out.println("Invalid choice. Please try again.\n");
            }

        } while (choice != 5); //cancel program if 5 is entered

        System.out.println("Program exited successfully.");
    }
}
