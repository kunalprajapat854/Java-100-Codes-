package Basics;

public class fibonacci {
    public static void main(String[] args) {

        int a = 0, b = 1;
        int num = 5, next = 0;
        System.out.println("fibonacci " + a + "," + b);

        for (int index = 0; index <= num; index++) {
            next = a + b;
            a = b;
            b = next;

        }
        System.out.println(next);

    }

}

// 0 + 1 = 1
// 1 + 2 = 3
// 2 + 3 = 5
// 3 + 4 = 7
// 4 + 5 = 9
// 5 + 6 = 11
// 6 + 7 = 13 (output)