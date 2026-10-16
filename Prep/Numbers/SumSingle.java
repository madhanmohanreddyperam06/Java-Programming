// find the sum of digits in a given number until the sum becomes single digit

public class SumSingle{
    public static void main(String[] args){
        int n = 12345;
        while(n>=10){
            int sum = 0;
            while(n>0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            n=sum;
        }
        System.out.println(n);
    }
}