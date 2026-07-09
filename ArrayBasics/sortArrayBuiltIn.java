package ArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class sortArrayBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int[] arr = {1,2,3,4,5,-8,12,0};
            print(arr);
            Arrays.sort(arr);
            print(arr);
    }
    public static void print(int[] arr){
           for(int i =0;i<arr.length;i++){


               System.out.print(arr[i]+" ");
           }
        System.out.println();
    }

}
