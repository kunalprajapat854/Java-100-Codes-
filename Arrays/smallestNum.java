package Arrays;

import java.util.Arrays;

public class smallestNum {

    public static void main(String[] args) {
        int arr[] = { 10, 56, 45, 45 };
        int n = arr.length;
        int min = arr[0];
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // it is used for find only max number

        // int result = 0;
        // for (int i = 0; i < arr.length; i++) {
        // result = arr[i];
        // }
        // System.out.println(result);

        for (int i = 0; i < n; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }

}
