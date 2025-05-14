public class prime_number {
    public static void main(String[] args) {
        int num = 3;
        boolean isprime = true;

        if (num < 2) {

        }

        else {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        String result = isprime ? "Prime" : "Not Prime";
        System.out.println("The number " + num + " is " + result);

    }

}
