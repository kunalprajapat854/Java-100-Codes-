package Basics;

public class strong_num {
    public static void main(String[] args) {
        int num = 145, temp, sum = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;

        }
        if (sum == num) {
            System.out.println("Prime factor " + num);
        } else {
            System.out.println("is not prime factor" + num);
        }
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
