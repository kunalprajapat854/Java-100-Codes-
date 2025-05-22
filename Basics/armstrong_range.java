package Basics;

public class armstrong_range {
    public static void main(String[] args) {
        int count = 0, digit = 0;
        for (int number = 1; number <= 10000; number++) {
            digit = number % 10;
            count++;
        }
        System.out.println(count);
    }

}
