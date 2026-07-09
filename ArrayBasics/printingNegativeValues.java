package ArrayBasics;

import java.util.Scanner;

public class printingNegativeValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of element ");

        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("enter your element ");
        for(int i =0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }

        for(int i =0;i<arr.length;i++){
            if(arr[i]<0) {
                System.out.println(arr[i]);
            }
        }


    }
}
