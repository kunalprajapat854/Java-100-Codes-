package Strings;

public class vowels {
    public static void main(String[] args) {
        char c = 'a';

        if (vowels(c)) {
            System.out.println(c + " is a vowel");
        } else {
            System.out.println(c + " is constant");
        }
    }

    public static boolean vowels(char c) {

        c = Character.toUpperCase(c);
        return (c == 'A' || c == 'I' || c == 'O' || c == 'E' || c == 'U');
    }

}
