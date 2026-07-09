package ArrayBasics;

import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr ={4,3,2,-1,0,-5,32};
        int min =arr[0];

        for(int i =0;i< arr.length;i++){
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
