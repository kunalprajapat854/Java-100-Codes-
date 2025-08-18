package Arrays;

import java.util.Arrays;

public class sortArrayAscDsc {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 4, 3, 2, 1 };
        printOrder(arr);

    }

    // function to print half of the array in
    // ascending order and the other half in
    // descending order

    public static void printOrder(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= n / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = n - 1; i > n / 2; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}
