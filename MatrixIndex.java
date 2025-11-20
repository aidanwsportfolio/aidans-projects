import java.util.Scanner;

public class ScottTask1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        // Input matrix 1
        System.out.println("Enter matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        // Input matrix 2
        System.out.println("Enter matrix2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Multiply matrices
        int[][] result = multiplyMatrix(matrix1, matrix2);

        // Print result
        System.out.println("The multiplication of the matrices is: ");
        printMatrix(result);
   input.close(); //finally i'm closing the input
    }
//how to multiply the matrices
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                result[row][col] =
                        matrix1[row][0] * matrix2[0][col] +
                        matrix1[row][1] * matrix2[1][col] +
                        matrix1[row][2] * matrix2[2][col];
            }
        }

        return result;
    }
//order of printing
    public static void printMatrix(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
