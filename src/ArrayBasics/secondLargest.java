package ArrayBasics;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={10,9,10,3,4,8};
        //int[] arr = {10,2,10,9,8,7};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];

            }
        }

        System.out.println(max);
        System.out.println(smax);
    }
}
