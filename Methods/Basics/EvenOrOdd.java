public class EvenOrOdd{
    public static void checkEvenOrOdd(int n){
        if(n%2==0){
            System.out.println(n + " is Even Number");
        }else{
            System.out.println(n + " is Odd Number");
        }
    }
    public static void main(String[] args){
            checkEvenOrOdd(7);
            checkEvenOrOdd(6);
        }
}