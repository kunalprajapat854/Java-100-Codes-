package Arrays;

public class RemoveDuplicateSorted {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 3, 3, 4, 5, 4, 6, 6 };

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        int removeDuplicate = removeDuplicateElement(nums);
        System.out.println();

        for (int i = 0; i < removeDuplicate; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int removeDuplicateElement(int num[]) {
        int n = num.length;
        int rd = 0;

        for (int i = 0; i < n; i++) {
            if (num[i] != num[rd]) {
                rd++;
                num[rd] = num[i];
            }
        }
        return rd + 1;
    }

}
