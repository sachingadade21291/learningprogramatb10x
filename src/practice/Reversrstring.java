package practice;

public class Reversrstring {
    public static void main(String[] args){

        String name="Sachin";
        String rev="";
       for(int i=name.length()-1;i>=0;i--){
            char r=name.charAt(i);
            rev=rev+r;
        }
        System.out.println(rev);





    }

}
