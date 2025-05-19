package Arrays;

public class print_sum_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        maxsumarray(arr);

        // output
        // [1]
        // [1, 2]
        // [1, 2, 3]
        // [1, 2, 3, 4]
        // [2]
        // [2, 3]
        // [2, 3, 4]
        // [3]
        // [3, 4]
        // [4]

    }

    public static void maxsumarray(int arr[]) {
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.print("[");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);
                    if (i < end) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

            }

        }

    }
}
