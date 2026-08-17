package methods;

import java.util.Scanner;

public class pascalsTriangle {
    public static int fact(int x){
        int x_fact=1;
        for(int i =1;i<=x;i++){
            x_fact=x_fact*i;
        }
        return x_fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value ");
        int n = sc.nextInt();
        for(int i =0;i<=n;i++){
            for(int j =0;j<=i;j++){
                int icr=fact(i)/(fact(j)*fact(i-j));
                System.out.print( icr+" ");
            }
            System.out.println(" ");

        }


    }
}
