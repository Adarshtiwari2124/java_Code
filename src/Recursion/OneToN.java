package Recursion;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num(1,n);

    }
        public static void num(int x ,int n){
            if(x>n) return;
            System.out.println(x);
            num(x+1,n);
        }
}
