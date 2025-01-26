package practice;

public class NOISPALINDROME {
    public static void main(String[] args) {
        int number=12321;
        String no=Integer.toString(number);
        String rev_no="";
        char r;
        for(int i=no.length()-1;i>=0;i--){
            r =no.charAt(i);
        rev_no=rev_no+r;

    }
        System.out.println(rev_no);
        if(no.equals(rev_no)){
            System.out.println("The no is palindrome");
        }
        else {
            System.out.println("The no is not palindrome");
        }

    }
}
