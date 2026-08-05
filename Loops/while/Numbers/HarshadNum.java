// check whether the given number is Harshad number or not


public class HarshadNum{
    public static void main(String[] args){
        int n=171;
        isHarshad(n);
    }
    public static void isHarshad(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(temp%sum==0){
            System.out.println(temp+" is a Harshad Number");
        }else{
            System.out.println(temp+ " is not a Harshad Number");
        }
    }
}