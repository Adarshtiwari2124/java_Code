package Recursion;

import java.util.Scanner;

public class powerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base: ");
        int a = sc.nextInt();
        System.out.println("enter the exponent: ");
        int b = sc.nextInt();
       // System.out.println(a+" raised to power "+b+ " is "+Math.pow(a,b));
        System.out.println(a+" raised to power "+b+ " is "+pow(a,b));
    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        return a*pow(a,b-1);
    }

}
