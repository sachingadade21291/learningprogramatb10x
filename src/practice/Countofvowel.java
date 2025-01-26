package practice;

public class Countofvowel {
    public static void main(String[] args) {

        String name = "sachin";
        int nocowels = 0;
        int no_of_consonentonent = 0;

        char r;
        char a = 'a';
        char o = 'o';
        char u = 'u';
        char i = 'i';
        char e = 'e';
        for (int j = 0; j <= name.length() - 1; j++) {
            r = name.charAt(j);
            if (r == a || r == o || r == u || r == i || r == e) {
              ++ nocowels;
            } else {
                no_of_consonentonent++;
            }

        }
        System.out.println("no of vowels="+nocowels);
        System.out.println("no of consonant="+no_of_consonentonent);
    }
}