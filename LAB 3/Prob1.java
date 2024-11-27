//  program to calculate the average value of array elements
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<n; i++) {
            sum = sum + arr[i];
        }

        int average = sum / n;

        System.out.println("average: " + average);
        sc.close();
    }
}
