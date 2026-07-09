package ArrayBasics;

import java.util.Scanner;

public class multiplyoddindex2addeven10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            if(i%2!=0){
                arr[i]*=2;

            }else{
                arr[i]+=10;
            }
            System.out.println(arr[i]+" ");
        }
    }
}
