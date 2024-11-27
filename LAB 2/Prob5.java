import java.util.Scanner;

public class Prob5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second num: ");
        int num2 = sc.nextInt();

        int gcd = 1;
        for(int i=1; i<=num1 && i<=num2; i++) {
            if(num1%i==0 && num2%i==0) {
                gcd = i;
            }
        }

        int lcm = (num1 * num2) / gcd;

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);

        sc.close();
    }
}
