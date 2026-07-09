package multiDimensionalArray;

public class outputIn2DArray {
    public static void main(String[] args) {
//        int[][] arr= new int[3][4];
        int[][] arr= {{2,3,4,5},{3,4,5,6},{2,4,2,5}};
        System.out.println(arr.length+" "+arr[0].length);
//        for(int i =0;i<3;i++){
//            for(int j =0;j<4;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        for(int i =0;i< arr.length;i++){
           for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
    }
}
