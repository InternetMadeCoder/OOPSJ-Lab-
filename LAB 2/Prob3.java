import java.util.Scanner;

public class Prob3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1; 
        for(int i=num; i>=1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
        sc.close();
    }
}
