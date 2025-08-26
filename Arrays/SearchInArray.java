package Arrays;

import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 5 };
        int target = 5;
        System.out.println(Arrays.toString(nums));

        System.out.println("Target number in array " + target);
        int findArray = searchInsert(nums, target);
        System.out.println("Target element index " + findArray);

    }

    public static int searchInsert(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= target) {
                return i;
            }
        }
        return n;
    }

}
