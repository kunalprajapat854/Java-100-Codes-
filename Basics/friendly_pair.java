package Basics;

public class friendly_pair {
    public static void main(String[] args) {

        int num1 = 6, num2 = 28;
        int sum1 = factor(num1);
        int sum2 = factor(num2);

        if (sum1 / num1 == sum2 / num2)
            System.out.println(num1 + " & " + num2 + " are friedly pairs.");
        else
            System.out.println(num1 + " & " + num2 + " are not friedly pairs.");

    }

    static int factor(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num * i == 0)
                sum = sum + i;
        }
        return sum;
    }

}

// Example
// Input : 6 28
// Output : Yes, they are a friendly pair
// Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2,
// 3 and 1, 2, 4, 7, 14 respectively.
// Now the sum of factors of both the numbers are 6 and 28 respectively.
// When we divide the sums with the numbers we get 1 and 1 respectively.
// As the ratio of both the number match, they are considered as a friendly
// pair.
