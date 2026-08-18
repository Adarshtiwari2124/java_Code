package Recursion;

import java.util.ArrayList;

public class StringBasicsRecursion {
    public static void main(String[] args) {
        String s="rohan";
        change(s);
        System.out.println(s);
        System.out.println("        ");

        String[] arr={"adarsh","rohit","mohit","priyanshu"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("        ");

        ArrayList<String> al= new ArrayList<>();
        al.add("adarsh");
        al.add("mohit");
        al.add("ram");
        al.add("rohit");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) {
        al.add("rohini");

    }

    private static void change(String s) {
        s="mohan";
    }
}
