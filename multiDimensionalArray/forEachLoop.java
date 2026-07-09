package multiDimensionalArray;

public class forEachLoop {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{2,3,4,5,6},{2,5,7,7,0}};

        for(int i=0;i< arr.length;i++){
            for(int ele: arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println("this is another method bhaiya");
      //  or
        for(int[] a : arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
