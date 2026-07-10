package multiDimensionalArray;

import java.util.ArrayList;

public class _2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);a.add(20);a.add(30);a.add(40);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(10);b.add(20);b.add(30);b.add(40);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(10);c.add(20);c.add(30);c.add(40);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);

        System.out.println(arr);

        for(int i =0;i< arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println("FOR EACH LOOP");

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);

        for(ArrayList<Integer> k: arr){
            for(int ele:k){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
