package Arrays;

public class max_num {
    public static void main(String[] args) {
        int arr[] = { 10, 15, 65, 45, -1 };
        int max = -1;
        int ans[];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = max;
            // store largest element of array into ans[]
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("Max Integer Into Array: " + max);
    }

}
