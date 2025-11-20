public class ScottTask2 {
    public static void main(String[] args) {
        int n = 4; //total rows in upper half including the middle

        //Upper Triangle 
        for (int i = 0; i < n; i++) {
            //print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }

        //Lower Triangle
        for (int i = n - 2; i >= 0; i--) {
            // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }
}
