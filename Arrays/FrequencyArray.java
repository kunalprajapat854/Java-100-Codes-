package Arrays;

import java.util.Arrays;

public class FrequencyArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 30, 10, 20, 30, 10 };
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + ":" + count);

        }

    }

}
