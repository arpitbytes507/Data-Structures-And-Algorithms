package Algorithms.Sorting;
// Sorting Algorithms : These algorithms are used to rearrange the data elements. 
/* Sorting are of two types comparison-based and non-comparison based sorting. */
/* In comparison based sorting we compare the two elements and then sort. */
/* Non-comparison based sorting is just opposite of comparison based sorting. */
// Comparison-Based Sorting
// 1. Selection sort : T.C. = O(n^2)  S.C. = O(1)

public class Selection {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Assume the current element index is the smallest element in an array
            int min = i;
            // iterate through the remaining array to find if their is smaller element than
            // i or not
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    // update the index if the element is found
                    min = j;
                }
            }
            // move minimum element to it's correct position by swapping them
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}