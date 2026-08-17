package ArrayBasics;

import java.util.Scanner;

public class arrayOFOtherDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //double[] arr = new double[4];

        //char[] arr = new char[4];
        String[] arr ={"ADARSH","DIVYANSHU","HARSHIT"};
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
