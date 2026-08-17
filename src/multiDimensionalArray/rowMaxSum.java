package multiDimensionalArray;

public class rowMaxSum {
    public static void main(String[] args) {

        int[][] arr= {{2,3,4,5},{2,3,4,5},{2,4,5,6}};
        int maxSum=0;
        int row=-1;
        for(int i =0;i<arr.length;i++){

            int sum=0;
            for(int j =0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
          // maxSum= Math.max(maxSum,sum);
            if(sum>maxSum){
                maxSum=sum;
                row=i;
            }
        }
        System.out.println(row+" "+maxSum);

    }
}
