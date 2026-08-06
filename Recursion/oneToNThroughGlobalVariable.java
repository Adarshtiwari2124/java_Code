package Recursion;

import java.util.Scanner;

public class oneToNThroughGlobalVariable {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        num(n);
    }
//    public static void num(int x){
//        if(x>n){
//            return;
//        }
//        System.out.println(x);
//        num(x+1);
//    }
     public static void num(int n){
        if(n==0) return;
        num(n-1);
        System.out.println(n);

     }

}
