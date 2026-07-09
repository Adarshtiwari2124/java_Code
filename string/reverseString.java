package string;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your string ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);




    }
}
