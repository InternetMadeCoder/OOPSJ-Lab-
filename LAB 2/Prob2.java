import java.util.Scanner;

public class Prob2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        switch(marks) {
            case 10:
                System.out.println("Grade A");
                break;
            
            case 9:
            case 8:
                System.out.println("Grade B");
                break;

            case 7:
            case 6:
                System.out.println("Grade C");
                break;

            case 5:
            case 4:
                System.out.println("Grade D");
                break;

            case 3:
            case 2:
            case 1:
                System.out.println("Grade F");
                break;

            default:
                System.out.println("Invalid marks");
                break;
        }
        sc.close();
    }
}
