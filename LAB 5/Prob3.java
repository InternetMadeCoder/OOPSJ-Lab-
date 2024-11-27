import java.util.Scanner;

public class Prob3 {
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
            }
            return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, key);
        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + result);
        }
        sc.close();
    }
}
