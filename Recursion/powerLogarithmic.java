package Recursion;

import java.util.Scanner;

public class powerLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base: ");
        int a = sc.nextInt();
        System.out.println("enter the exponent: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to power "+b+ " is "+pow(a,b));
    }

    public static int pow(int a,int b){
        if(b==0) return 1;
        int call=pow(a,b/2);
        if(b%2==0) return call*call;
        else
         return a*call*call;

    }

}
