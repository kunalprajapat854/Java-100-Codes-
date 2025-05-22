import java.util.Scanner;

public class palindrome_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome");
        int number = sc.nextInt();
        int temp = number;
        int reversed = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (number == reversed)
            System.out.println("Palindrome Number :" + number);
        else
            System.out.println("Not Palindrome :" + number);
    }
}
