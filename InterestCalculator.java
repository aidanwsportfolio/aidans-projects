import java.util.Scanner;

public class InterestCalculator {

    public static double calculateFutureBalance(double principal, double rate, int years) {
        return principal * Math.pow(1 + rate / 100, years);
    }

    public static void displayBalance(double principal, double rate, int years, double futureBalance) {
        System.out.printf("Initial Balance: $%.1f%n", principal);
        System.out.printf("Interest Rate: %.1f%%%n", rate);
        System.out.printf("Years: %d%n", years);
        System.out.printf("Future Balance: $%.15f%n", futureBalance);
    }

    public static void increaseRate(double rate) {
        rate = rate++;
        System.out.printf("Inside method: new rate after +1%% = %.1f%%%n", rate);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        if (principal > 0 && rate >= 0 && years > 0) {
            double futureBalance = calculateFutureBalance(principal, rate, years);
            displayBalance(principal, rate, years, futureBalance);
            increaseRate(rate);
            System.out.printf("After method call: original rate = %.1f%%%n", rate);
        } 
        else {
            System.out.println("Invalid input. Balance must be > 0, rate ≥ 0, and years > 0.");
        }
    }
}
