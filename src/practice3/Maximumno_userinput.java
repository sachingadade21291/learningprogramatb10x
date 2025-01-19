package practice3;

public class Maximumno_userinput {
    public static void main(String[] args) {
        String arg=args[0];
        int n1=Integer.parseInt(arg);
        String ajn=args[1];
        int n2=Integer.parseInt(ajn);
        int Largest_no= n1>n2? n1:n2;
        char c='\t';
        System.out.println("Largest no is"+c+Largest_no );
    }
}
