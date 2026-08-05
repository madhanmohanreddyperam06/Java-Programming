// check whether number is neon number or not


public class NeonNum{
    public static void main(String[] args){
        int n=125;
        isNeon(n);
    }
    public static void isNeon(int n){
        int sq=0;
        int sum=0;
        while(sq>0){
            int rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        if(sum==n){
            System.out.println(n+ " is a Neon Number");
        }else{
            System.out.println(n+ " is not a Neon Number");
        }
    }
}