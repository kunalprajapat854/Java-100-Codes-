public class leap_year {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year " + year);
        } else {
            System.out.println("Not a leap year " + year);
        }
    }
}
