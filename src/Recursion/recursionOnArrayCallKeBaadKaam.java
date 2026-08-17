package Recursion;

public class recursionOnArrayCallKeBaadKaam {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,78,9};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr, int idx){
        if(idx==arr.length) return;
        recPrint(arr,idx+1);
        System.out.print(arr[idx]+" ");

    }


}
