package Arrays;

public class calculateSum {
    public static void main(String[] args) {
        int arr[] = { 45, 15, 5, 60, 20 };
        ArrayelementSum(arr);
        System.out.println("Sum of elements are : " + ArrayelementSum(arr));

    }

    public static int ArrayelementSum(int arr[]) {
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;

    }

}
