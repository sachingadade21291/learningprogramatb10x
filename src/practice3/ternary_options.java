package practice3;

public class ternary_options {
    public static void main(String[] args) {
        String vote=args[0];
        int age=Integer.parseInt(vote);

        String Vote_j=age>=18? "Eligible for vote":"Not eligible for vote";
        System.out.println(Vote_j);
    }
}
