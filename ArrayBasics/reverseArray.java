package ArrayBasics;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of arr ");
        int size=sc.nextInt();

        int[] arr = new int[size];
        int n =arr.length;

        System.out.println("array elements please enter ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("your elements are that are going to reversed ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int i =0,j=n-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }


        System.out.println("reversed element are ");
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
}
