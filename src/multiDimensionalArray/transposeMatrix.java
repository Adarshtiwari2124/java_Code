package multiDimensionalArray;

import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {

        int[][] arr={{1,2,3,4},{2,3,4,5},{3,4,5,5},{2,3,4,5}};

//        for(int[] a : arr){
//            for(int ele:a){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
        print(arr);
//        for(int i =0;i<arr.length;i++){
//            for(int j =0;j<arr[0].length;j++){  // galt matrix ayyega
//
//                int temp=arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//
//            }
//        }
        System.out.println();
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<i;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }

        print(arr);

    }

    private static void print(int[][] arr) {

       for(int[] a: arr){
           for(int ele: a){
               System.out.print(ele+" ");
           }
           System.out.println();
       }

    }
}
