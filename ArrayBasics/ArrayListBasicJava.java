package ArrayBasics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasicJava {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(5);
        arr.add(31);
        arr.add(21);
        arr.add(11);

        System.out.println(arr.get(2));
        arr.set(2,35);
        System.out.println(arr.get(2));

        System.out.println(arr);

        int n =arr.size();
        for(int i =0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }


        System.out.println();
//        for(int ele: arr){
//            System.out.print(ele+" ");
//        }

        arr.add(78);
        System.out.println(arr);

        arr.add(1,79);
        System.out.println(arr);

        arr.remove(5);
        arr.remove(arr.size()-1);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
