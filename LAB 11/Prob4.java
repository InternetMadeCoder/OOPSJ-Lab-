import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Division by zero
            System.out.print("Enter two numbers for division: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Result: " + (a / b));

            // String to numeric conversion
            System.out.print("Enter a numeric string: ");
            String str = scanner.next();
            int num = Integer.parseInt(str);

            // Invalid index in string
            System.out.print("Enter a string: ");
            String s = scanner.next();
            System.out.println("Character at index 10: " + s.charAt(10));

            // Invalid index in array
            int[] array = {1, 2, 3};
            System.out.println("Element at index 5: " + array[5]);

        } catch (ArithmeticException e) {
            System.out.println("Invalid division.");
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid.");
        } catch (Exception e) {
            System.out.println("Exception encountered.");
        }
    }
}
