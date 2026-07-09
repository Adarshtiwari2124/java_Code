package string;
import java.util.*;
public class ToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE STRING ");
        String s = sc.nextLine();

        char ch[] = s.toCharArray();

        for(int i= 0;i<ch.length;i++){
            System.out.print(ch[i] +" ");
        }

    }
}
