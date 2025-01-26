package practice;

public class Palindrome {
    public static void main(String[] main) {
        String name = "naman";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            char r = name.charAt(i);
            rev = r + rev;
        }
        System.out.println(rev);
        if (name.equals(rev)) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not palindrome");
        }
    }
}
