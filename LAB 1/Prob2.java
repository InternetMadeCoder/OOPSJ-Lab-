import java.util.Scanner;

public class Prob2 {
    public static void main(String args[]) {
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose operation:\n 1) Addition\n 2) Substraction\n 3) Multiplication\n 4)Division");
        int operation = sc.nextInt();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case 4: 
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                break;
        }
        sc.close();
    }
}
