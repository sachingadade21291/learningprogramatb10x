package practice3;

public class ternery_operation1 {
    public static void main(String[] args) {
        String argsh=args[0];
        int age=Integer.parseInt(argsh);
        String plan=age>=18 ? (age>=25?"Allow to go goa and allow to drink":"Do not drink"):"does not allpw to go goa";
        System.out.println(plan);
    }

}
