package Basics;

public class sum_of_natural_num {
    public static void main(String[] args) {
        int num = 5; // 1 2 3 4 5 = 9+5+1 = 15
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of N natural number is " + "= " + sum);
    }

}
