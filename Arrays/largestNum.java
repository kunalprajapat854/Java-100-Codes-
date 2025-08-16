package Arrays;

import java.util.Arrays;

public class largestNum {
    public static void main(String[] args) {

        int arr[] = { 12, 13, 1, 10, 65, 10 };

        // approach 1
        // int max = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        // if (max < arr[i]) {
        // max = arr[i];
        // }
        // }
        // System.out.println(max);

        // approach 2
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length - 1]);

        // approach 3
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = arr[i];

            System.out.print(result);
        }

    }

}
