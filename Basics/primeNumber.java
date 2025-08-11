package Basics;

import java.util.*;

public class primeNumber {
    // public static void main(String[] args) {
    // int nums = 50;
    // for (int i = 2; i < nums; i++) {
    // if (isprime(i)) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    // public static boolean isprime(int n) {
    // if (n < 1)
    // return false;
    // for (int i = 2; i <= n; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // return true;
    // }
    // return false;
    // }

    // }

    // // output
    // // 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49

    // public class reverseNumber {
    // public static void main(String[] args) {

    // // reading the input for the end user predefined class scannner .
    // Scanner scanner = new Scanner(System.in);

    // System.out.println("Enter the number to reverse ");

    // // reading the long values from the end user for ex : 9754888221
    // long nums = scanner.nextLong();

    // // printing the original number
    // System.out.println("Original Number : " + nums);

    // // call reverseNum function to reverse the original num .
    // System.out.println("Reversed Number : " + reverseNum(nums));
    // }

    // public static long reverseNum(long num) {
    // long remainder = 0, reverse = 0;
    // while (num > 0) {
    // remainder = num % 10;
    // reverse = reverse * 10 + remainder;
    // num /= 10;
    // }
    // return reverse;

    public static int fibonacci(int num) {
        int a = 0;
        int b = 1;

        int next = 0;

        for (int index = 0; index <= num; index++) {
            next = a + b;
            a = b;
            b = next;

        }
        return next;
    }

    public static void main(String[] args) {
        int result = fibonacci(5);

        for (int i = 0; i <= result; i++) {
            System.out.println(i + " ");
        }
        System.out.println("Sum of fibonacci series  ::" + result);
    }
}
