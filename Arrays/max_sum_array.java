package Arrays;

public class max_sum_array {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int start = arr[0];
        int end = arr[0];

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(arr[i], start + arr[i]);
            end = Math.max(start, end);
            System.out.println(end);
        }
    }
}