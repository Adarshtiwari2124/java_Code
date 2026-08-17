package ArrayBasics;

import java.util.Scanner;

public class reverseArrayByOneLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr={10,20,30,40,50};
        int n = arr.length;
         for(int i =0;i<arr.length/2;i++){
             int temp = arr[i];
             arr[i]=arr[n-1-i];
             arr[n-1-i]=temp;
         }

//        for(int i =0;i<n;i++){
//            System.out.println(arr[i]);
//        }

        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
