// Prob4: Temperature Conversion
import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (F)ahrenheit or (C)elsius? ");
        char choice = scanner.next().charAt(0);

        if (choice == 'F' || choice == 'f') {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 'C' || choice == 'c') {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}