package multiDimensionalArray;

public class sum2dArray {
    public static void main(String[] args) {
        int[][] arr= {{2,3,4,5},{4,5,6,8},{2,3,4,5}};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }


}
