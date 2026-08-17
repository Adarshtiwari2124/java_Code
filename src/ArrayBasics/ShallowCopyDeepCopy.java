package ArrayBasics;
import java.util.Arrays;

import java.util.Scanner;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,2,3,4,5,6,7};
      //  int[] x= arr; // shallow copy of arr
      //  x[2]=10;
       // System.out.println(arr[2]);

        int[] deep =Arrays.copyOf(arr,arr.length);
        deep[1]=10;
        System.out.println(arr[1]);


    }
}
