package Basics;

import java.util.*;

public class prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find prime factors ");

        int num = sc.nextInt();
        System.out.print("Prime factor of " + num + " are : ");

        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num = num / 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }

        }
        if (num > 2) {
            System.out.print(num);
        }

    }

}
