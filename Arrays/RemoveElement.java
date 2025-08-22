package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = { 5, 6, 8, 7, 65, 45, 45 };
        int target = 45;
        int k = removeElement(nums, target);
        System.out.println("k = " + k);
        System.out.println(Arrays.toString(nums));

    }

    public static int removeElement(int[] nums, int target) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != target) {
                nums[count] = nums[i];
                count++;
            }
        }
        return nums[count];
    }

}
