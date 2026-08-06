package Recursion;

import java.util.Scanner;

public class oneToNThroughGlobalVariable {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        num(1);
    }
    public static void num(int x){
        if(x>n){
            return;
        }
        System.out.println(x);
        num(x+1);
    }

}
