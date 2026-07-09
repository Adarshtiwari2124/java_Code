package methods;

import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n =sc.nextInt();
        System.out.println("enter the value of r ");
        int r = sc.nextInt();

        int nfact =1;
        for(int i =1;i<=n;i++){
            nfact*=i;
        }
        int rfact =1;
        for(int i =1;i<=r;i++){
            rfact*=i;
        }
        int n_rfact =1;
        for(int i =1;i<=n-r;i++){
            n_rfact*=i;
        }

        int ncr=nfact/(rfact * n_rfact);
        System.out.println(ncr);



    }

}
