package practice3;

public class Lab22_abcd_grade {
    public static void main(String[] args) {

      String argd=args[0];
        int marks=Integer.parseInt(argd);
String result= marks>=90? "A Grade":(marks>=80? "B Grade":(marks>=70? "c grade":(marks>=60? "D grade":(35<=marks && marks<=60 ? "F grade":"Fail"))));
        System.out.println(result);
    }
}
