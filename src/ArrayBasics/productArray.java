package ArrayBasics;

import java.util.Scanner;

public class productArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int product = 1;
        int[] arr ={2,3,4,5};
        for(int i =0;i< arr.length;i++){
            product=product*arr[i];
        }
        System.out.println(product);

    }
}
