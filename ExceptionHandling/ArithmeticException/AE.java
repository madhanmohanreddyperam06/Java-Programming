// Arithmetic Exception

public class AE{
    public static void main(String[] args){
    System.out.println("Main Starts");
    try{
        System.out.println(1/0);
    }catch(ArithmeticException e){
        System.out.println("Denominator cannot be Zero");
    }
    System.out.println("Main Ends");
    }
}