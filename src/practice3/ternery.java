package practice3;

public class ternery {
    public static void main(String[] args) {
        String qwe=args[0];
        int n1=Integer.parseInt(qwe);
                String hjh=args[1];
                int n2=Integer.parseInt(hjh);
                String jhj=args[2];
                int n3=Integer.parseInt(jhj);
                int largest_no=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println("Largest no is "+largest_no
        );
    }
}
