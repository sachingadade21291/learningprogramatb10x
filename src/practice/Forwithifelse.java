package practice;

public class Forwithifelse {
    public static void main(String[] args){
        for(int i=0;i<=100;i++)
        {
            if (i%3==0 || i%5==0)
            {
             if(i%3==0 && i%5!=0)
             {
                 System.out.println("Fizz");
             }
            else if(i%5==0 && i%3!=0)
             {
                 System.out.println("Mass");
             }
               else
               {
                 System.out.println("Fizz Mass");
             }

            }
            else{
                System.out.println("The no is not divisible by 3 & 5");
            }
        }

    }

}
