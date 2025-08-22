package Arrays;

// leetcode classic problem
public class ReverseInteger {

    public static void main(String[] args) {
        int a = -123;
        System.out.println(reverseInt(a));

    }

    public static int reverseInt(int x) {
        int remainder = 0, reverse = 0;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        while (x > 0) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0; // overflow
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0; // underflow
            }

        }
        return reverse;
    }

}
