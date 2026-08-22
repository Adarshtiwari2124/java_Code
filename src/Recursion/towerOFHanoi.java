package Recursion;

public class towerOFHanoi {
    public static void main(String[] args) {
        hanoi(4,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        hanoi(n-1,a,c,b);  //n-1 disks from a to b via c
        System.out.println(a+" -> "+c);// largest disks from a to c
        hanoi(n-1,b,a,c);// n-1 disks from b to c via a
    }
}
