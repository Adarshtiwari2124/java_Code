package Recursion;

public class RecursionOnArrayFindTarget {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,78,9};
        int target=0;
        System.out.println(exists(arr,target,0));
    }

   public static boolean exists(int[] arr,int target,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==target) return true;
        return(exists(arr,target,idx+1));
   }

}
