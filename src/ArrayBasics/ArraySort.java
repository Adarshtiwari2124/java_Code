package ArrayBasics;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element of array ");
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the element you want  to find ");
        int target = sc.nextInt();

        boolean flag =false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                flag = true;
                break;

            }

        }
        if(flag==true){
            System.out.println("elements target found ");
        }else{
            System.out.println("elements target not found  chacha ");
        }
    }
}
