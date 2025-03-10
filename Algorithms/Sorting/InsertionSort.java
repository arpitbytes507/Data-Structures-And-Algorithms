package Algorithms.Sorting;

// Insertion sort puts the element in its correct position by sorting elements step by step
// T.C. = O(n^2) | S.C. = O(1) | Stable Sort
public class InsertionSort {
    /* Function to sort array using insertion sort */
    public static void sort(int arr[]) {
        int n = arr.length;
        // Iterate from the second element to the end
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift elements that are greater than 'current'
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place 'current' at its correct position
            arr[j + 1] = current;
        }
    }

    // Utility method to print the array
    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };

        System.out.print("Original array: ");
        printArray(arr);

        // Call the sort method directly using class name since it's static
        InsertionSort.sort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
