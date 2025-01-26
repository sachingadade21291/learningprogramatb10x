
package practice;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N1");
        int n1=sc.nextInt();
        System.out.println("Enter N2");
        int n2=sc.nextInt();
        System.out.println("Enter N3");
        int n3=sc.nextInt();
        if(n1>0 && n2>0 && n3>0)
        {
            if(n1==n2&&n2==n3)
            {
                System.out.println("Acute triangle");
            }
            else if(n1==n2||n2==n3||n1==n3)
            {
                System.out.println("isosles triangle");
            }
            else{
                System.out.println("cilwense triangle");
            }
        }
        else {
            System.out.println("Invalid data");
        }


    }



}
