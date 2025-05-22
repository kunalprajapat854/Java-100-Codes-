package Basics;

public class armstrong_num {
    public static void main(String[] args) {
        int number = 3712, count = 0, sum = 0, temp;
        temp = number;
        // Step 1 count the number of digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        // Step 2 calculate the digit ^n and add to the sum
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        // step 3 compare the sum and the original number
        if (number == sum) {
            System.out.println(number + " is a armstrong number");
        } else {
            System.out.println(number + " is not a armstrong number");
        }

    }
}
