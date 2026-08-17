package ArrayBasics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your element ");

        int[] arr = new int[7];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(2* arr[i] + " ");
        }

    }
}
