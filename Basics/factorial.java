package Basics;

public class factorial {
    public static void main(String[] args) {
        int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " is : " + fact);
    }

}

// 1*1=1
// 1*2=2
// 2*3=6
// 6*4=24
// 24*5=120 (output)
