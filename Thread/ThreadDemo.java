//

public class ThreadDemo{
    public static void main(String[] args){
        System.out.println("Main Thread is running");
        System.out.println(Thread.currentThread().getName());
    }
    public static void test(String s){
        System.out.println("Test Thread is running");
        System.out.println(Thread.currentThread().getName());
    } 
}