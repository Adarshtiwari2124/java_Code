package methods;

public class passingArguments {
    public static void greet(String name){
        System.out.println("Good morning "+name);

    }
    public static void sum(int a ,int b,int c){
        System.out.println("the sum is "+(a+b+c));
    }
    public static void intro(String name,int age){
        System.out.println("hello my name is "+ name+ "my age is "+age);
    }



    public static void main(String[] args) {
        greet("adarsh");
        sum(20,2,3);
        intro("rahul ",25);
        intro("preeti ",10);
    }
}
