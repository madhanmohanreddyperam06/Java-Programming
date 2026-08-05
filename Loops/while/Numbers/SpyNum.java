// check whether given number is Spy number or not -->(if number's sum==product then it is Spy number)

public class SpyNum{
    public static void main(String[] args){
        int n=123;
        isSpy(n);
    }
    public static void isSpy(int n){
        int sum=0;
        int product=1;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10;
        }
        if(sum==product){
            System.out.println(temp + " is a Spy Number");
        }else{
            System.out.println(temp + " is not a Spy Number");
        }
    }
}