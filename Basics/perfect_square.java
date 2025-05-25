package Basics;

import java.util.*;

public class perfect_square {
    public static void main(String[] args) {
        int n = 84;
        if (perfectsquare(n)) {
            System.out.println(n + " is perfect square.");
        } else {
            System.out.println(n + " is not perfect square.");
        }

    }

    public static boolean perfectsquare(int n) {
        if (n >= 0) {
            int sr = (int) Math.sqrt(n);
            return sr * sr == n;
        }
        return false;
    }

}
// A perfect square is a number that is the square of an integer.
// In other words, a number is a perfect square if you can express it as:
// Perfect Square=n×n