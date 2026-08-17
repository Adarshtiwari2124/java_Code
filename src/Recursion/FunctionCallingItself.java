package Recursion;

import java.util.Scanner;

public class FunctionCallingItself {
//    public static void main(String[] args) {
//        ajay();
//    }
//    public static void ajay(){          //Infinity Loop
//        System.out.println("priya");
//        ajay();
//    }

//    public static void main(String[] args) {
//        ajay(1);
//    }
//    public static void ajay(int n){
//        if (n==5) return;
//        System.out.println("priya");
//        ajay(n+1);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num(n);
    }

    public static void num(int n){
        if(n==0) return;
        System.out.println(n);
        num(n-1);
    }
}
