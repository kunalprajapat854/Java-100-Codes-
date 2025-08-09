package Basics;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int nums = 50;
        for (int i = 2; i < nums; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isprime(int n) {
        if (n < 1)
            return false;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

}

// output
// 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49