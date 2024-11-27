// Prob5: BMI Calculator
import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
        scanner.close();
    }
}