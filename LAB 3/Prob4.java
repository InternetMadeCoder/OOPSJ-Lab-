import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int count10 = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 10) {
                count10++;
            }
        }

        if(count10 == 3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
