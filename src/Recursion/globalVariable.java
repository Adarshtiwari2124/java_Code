package Recursion;

public class globalVariable {

//    public static void main(String[] args) {
//        int x =10;
//        change(x);
//        System.out.println(x);     // x is local variable
//    }
//    public static void change(int x){
//        x=20;
//    }

    static int x=5;
    public static void main(String[] args) {
        change();
        System.out.println(x);
    }
    public static void change(){
        x=7;
    }


}
