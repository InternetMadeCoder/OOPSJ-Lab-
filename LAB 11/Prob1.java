import java.util.HashSet;
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        System.out.println("Enter integers (type 'done' to finish):");
        
        try {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (!numbers.add(number)) {
                    throw new Exception("Duplicate number found: " + number);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
