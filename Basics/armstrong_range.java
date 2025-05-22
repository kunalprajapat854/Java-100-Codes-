package Basics;

public class armstrong_range {
    public static void main(String[] args) {

        // output
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9
        // 153
        // 370
        // 371
        // 407
        // 1634
        // 8208
        // 9474

        for (int number = 1; number <= 10000; number++) {
            int temp = number;
            int count = 0, digit = 0, sum = 0;

            while (temp != 0) {
                temp /= 10;
                count++;
            }

            temp = number;
            while (temp != 0) {

                digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }

            if (sum == number) {
                System.out.println(number);
            }

        }
    }
}
