package string;

import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       StringBuilder str = new StringBuilder("adarsh");

        str.setCharAt(0,'m');
        System.out.println(str);

        String s ="adarsh";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
