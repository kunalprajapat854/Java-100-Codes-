package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = { 10, 45, 65, 15 };
        int n = arr.length;

        // int start = 0;
        // int end = n - 1;

        // while (start < end) {
        // int temp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = temp;
        // start++;
        // end--;
        // }

        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

}
