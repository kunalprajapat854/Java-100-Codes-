package Basics;

public class harshad_num {
    public static void main(String[] args) {
        int number = 21, result = 0;
        while (number != 0) {
            int last_one = number % 10;
            result = result + last_one;
            number /= 10;
        }

        if (number % result == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not");
        }
    }

}
