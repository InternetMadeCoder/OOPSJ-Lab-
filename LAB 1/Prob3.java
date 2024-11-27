import java.util.Scanner;

public class Prob3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        float F = sc.nextFloat();

        float C = (F-32) * (5.0f/9.0f);

        System.out.println("Temperature in Celsius: " + C);
        sc.close();
    }
}
