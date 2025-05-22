public class prime_2_to_100 {
    public static void main(String[] args) {
        System.out.println("Print Prime numbers from 2 to 100");
        for (int number = 2; number <= 100; number++) {
            boolean isprime = true;
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(number);
            }
        }
    }
}
