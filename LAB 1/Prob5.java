import java.util.Scanner;

public class Prob5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();

        System.out.println("Prime numbers upto " + num + " are: ");
        for(int n=2; n<=num; n++) {
            boolean isPrime = true;

            // Check if n is prime
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print n if it is prime
            if (isPrime) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}
