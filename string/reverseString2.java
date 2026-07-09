package string;

import java.util.Scanner;

public class reverseString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your string ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        int i =0; int j =sb.length()-1;
        while(i<=j){
            char temp = sb.charAt(i);
            char temp2 =sb.charAt(j);

            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp);

            i++;
            j--;
        }
        System.out.println(sb);

    }
}
