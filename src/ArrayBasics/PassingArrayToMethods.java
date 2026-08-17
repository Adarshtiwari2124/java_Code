package ArrayBasics;

import java.util.Scanner;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={21,2,3,4,5,6};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);

    }
    public static void change(int[] arr){

        arr[2]=98;

    }
}
