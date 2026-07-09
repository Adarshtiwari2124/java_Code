package multiDimensionalArray;

import java.util.Scanner;

public class snakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr= new int[3][4];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println( "snake pattern dekh lo ");

        for(int i =0;i<arr.length;i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }
        }


    }
}
