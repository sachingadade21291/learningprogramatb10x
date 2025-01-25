package practice1;

public class Compound_Operator {
    public static void main(String[] args){
        String chau=args[0];
        int h=Integer.parseInt(chau);
        int j=20;
        h-=j;
        System.out.println(h);
        System.out.println(++h + --h);
        String hju=args[1];
        int age=Integer.parseInt(hju);
        String name=args[2];
        String hgh=args[3];
        int salary=Integer.parseInt(hgh);
        System.out.println("My age is\t" + age);
        System.out.println("My name is " +name);
        System.out.println("My salary is\t"+ salary);
    }
}
