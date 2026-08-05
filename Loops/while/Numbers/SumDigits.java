// find the sum of digits in a given number

public class SumDigits{
    public static void main(String[] args){
        int n=123456;
        isDigitSum(n);
    }
    public static void isDigitSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}