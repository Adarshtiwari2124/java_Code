package ArrayBasics;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr ={ -4,-3,-2,1,0,5};

        //int max=arr[0];
        int max =Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
        }
        System.out.println(max);
    }
}
