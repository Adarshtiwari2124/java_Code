package methods;

import java.util.Scanner;

public class combinationWithFunction {
    public static int fact(int x){
        int x_fact =1;
        for(int i=1;i<=x;i++){
            x_fact*=i;
        }
        return x_fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();
        System.out.println("enter your number ");
        int r = sc.nextInt();
//
//        int n_fact=fact(n);
//        int r_fact=fact(r);
//
//        int n_r_fact=fact(n-r);

        int ncr =fact(n)/(fact(r)*fact(n-r));

        System.out.println(ncr);





    }
}
