package Recursion;
//
//public class recursionOnArray {
//    public static void main(String[] args) {
//        int[] arr= {3,4,5,6,7,89,0};
//        recPrint(arr,0);
//    }
//    public static void recPrint(int[] arr,int idx){
//        int n =arr.length;
//        if(idx==n) return;
//        System.out.print(arr[idx]+" ");
//        recPrint(arr,idx+1);
//    }
//
//}
// reverse

public class recursionOnArray {
    public static void main(String[] args) {
        int[] arr= {3,4,5,6,7,89,0};
        int n =arr.length;
        recPrint(arr,n-1);
    }
    public static void recPrint(int[] arr,int idx){

        if(idx<0) return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx-1);
    }

}
