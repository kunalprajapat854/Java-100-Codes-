package Basics;

public class power {
    public static void main(String[] args) {
        int base = 5;
        int pow = 2;
        int result = 1;
        for (int i = 0; i <= pow; i++) {
            result = result * base;
        }
        System.out.println(result);

    }
    // output 125

}
