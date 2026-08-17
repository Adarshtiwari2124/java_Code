package ArrayBasics;

import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr ={2 ,3,4,5,6,7,8};
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);


    }
}
