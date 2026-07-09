package string;

import java.util.Scanner;

public class numberOfVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your value ");
        String str = sc.nextLine();

        int count =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
                //System.out.println(ch);
                count++;
            }

        }
        System.out.println(count);
    }
}
