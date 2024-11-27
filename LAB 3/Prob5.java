import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int newArr[] = new int[n];
        int evenIndex = 0;  // To keep track of where to place even numbers
        int oddIndex = n - 1;  // To keep track of where to place odd numbers

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Separate even and odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                // Place even numbers at the start
                newArr[evenIndex++] = arr[i];
            } else {
                // Place odd numbers at the end
                newArr[oddIndex--] = arr[i];
            }
        }

        // Output the new array
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        sc.close();
    }
}