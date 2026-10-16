// check whether the number is spy or not

public class Spy{
    public static void main(String[] args){
        int n = 1234;
        int temp = n;
        int sum=0;
        int product=1;
        while(n>0){
            int digit = n%10;
            sum=sum+digit;
            product=product*digit;
            n=n/10;
        }
        if(sum==product){
            System.out.println(temp + " is a SPY Number");
        }else{
            System.out.println(temp + " is not a SPY Number");
        }
    }
}