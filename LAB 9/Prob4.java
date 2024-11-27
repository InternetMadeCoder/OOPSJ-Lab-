// Define the Sortable interface
interface Sortable {
    void sort(int[] arr);
}

// Implement BubbleSort class
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted using BubbleSort: " + java.util.Arrays.toString(arr));
    }
}

// Implement MergeSort class
class MergeSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted using MergeSort: " + java.util.Arrays.toString(arr));
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}

// Main method for testing
public class Prob4 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 5, 6};
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr1); // Output: Sorted using BubbleSort: [1, 2, 5, 5, 6, 9]

        int[] arr2 = {3, 4, 1, 2, 8, 7};
        Sortable mergeSort = new MergeSort();
        mergeSort.sort(arr2); // Output: Sorted using MergeSort: [1, 2, 3, 4, 7, 8]
    }
}