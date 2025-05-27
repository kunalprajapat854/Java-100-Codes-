package Basics;

public class automorphic_num {
    public static void main(String[] args) {
        int num = 5;
        int square = num * num;
        if (square % 10 == num % 10) {
            System.out.println("automorphic number");
        } else {
            System.out.println("No");
        }
    }

}

// automorphic number means the square root of number matches the last number
// digit itself.
// 5* 5 = 25 last digit 5 matches the number itself it called automorphic
// number.
// 25 * 25 = 625
// 76 * 76 = 5776
