import java.util.Scanner;

public class Prob4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci series: " + firstTerm + " " + secondTerm + " ");

        for(int i=3; i<=n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        sc.close();
    }
}
