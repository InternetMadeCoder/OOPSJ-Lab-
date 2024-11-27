import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows of matrix: ");
        int rows = sc.nextInt();

        System.out.println("Enter cols of matrix: ");
        int cols = sc.nextInt();

        int matrix1[][] = new int[rows][cols];
        int matrix2[][] = new int[rows][cols];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Addition
        int sum[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Subtraction
        int sub[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Multiplication
        int mul[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mul[i][j] = 0;  // Initialize the value to 0
                for (int k = 0; k < cols; k++) {
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print Results
        System.out.println("Sum of matrices:");
        printMatrix(sum);

        System.out.println("Difference of matrices:");
        printMatrix(sub);

        System.out.println("Product of matrices:");
        printMatrix(mul);

        sc.close();
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
