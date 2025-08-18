package Arrays;

import java.util.Arrays;

public class largest_Smallest {
    public static void main(String[] args) {
        int arr[] = { 10, 15, 65, 89, -1, 25, };
        int n = arr.length;

        int largest = arr[0];
        int smalleset = arr[0];

        for (int i = 0; i < n; i++) {
            if (largest < arr[i])
                largest = arr[i];

            if (smalleset > arr[i])
                smalleset = arr[i];
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest Number " + largest + " Smallest number" + smalleset);

    }

}
