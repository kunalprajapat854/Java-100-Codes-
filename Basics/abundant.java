package Basics;

public class abundant {
    public static void main(String[] args) {
        int num = 18, sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum = sum + i;

            if (sum > num) {
                System.out.println(num + "is abundant number ");
                System.out.println("the abudance is " + (num - sum));
            } else
                System.out.println(num + "is not abundant number");
        }

    }

}
