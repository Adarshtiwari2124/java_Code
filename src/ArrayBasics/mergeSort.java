package ArrayBasics;

public class mergeSort{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 19};
        int[] arr2 ={ 10,11,12,13};

        int[] arr3= new int[arr.length+arr2.length];
        for(int ele:arr3){
            System.out.print(ele+" ");
        }
        System.out.println();

        merge(arr,arr2,arr3);


        for(int ele:arr3){
            System.out.print(ele+" ");
        }
        System.out.println();

    }

  public static void merge(int[] arr,int[] arr2, int[] arr3) {
    int i = 0, j = 0, k = 0;
    while (i < arr.length && j < arr2.length) {

        if (arr[i] < arr2[j]) {
            arr3[k] = arr[i];
            i++;

        } else {
            arr3[k] = arr2[j];
            j++;
        }
        k++;
    }

    if (i == arr.length) {
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
    }
    if (j == arr2.length) {
        while (i < arr.length) {
            arr3[k] = arr[i];
            i++;
            k++;
        }
    }

  }
}
