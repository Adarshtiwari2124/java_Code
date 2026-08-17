package BasicSorting;

public class bubbleSortOptimise {
    public static void main(String[] args) {
        int[] arr ={ 1,3, 4,2,10,6};
        int n =arr.length;
        for (int i =0;i<n-1;i++){
            int swaps=0;
            for(int j =0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;

                }
            }
            if(swaps==0) break;

        }
//       for(int ele:arr){
//           System.out.print(ele+" ");
//       }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
