package Arrays;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int arr[] = { 95, 65, 25, 10 };

        // approach 1 Bubble sort

        // bubbleSort(arr);
        // for (int num : arr) {
        // System.out.println(num + " ");
        // }

        // approach 2 : inbuilt Method in java to sort the array
        // Arrays.sort(arr);
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }

        // approach 3 : Selection Sort
        selectionSort(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }

    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // System.out.println("MinIndex" + i);
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { //
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

}
