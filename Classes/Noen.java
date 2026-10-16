public class Neon{
    public static void main(string[] args){
        int n=8;
        isNeon(n);
    }
    public static void isNoen(int n){
        int sq=n*n;
        int sum=0;
        while(sq>0){
            int rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        if(sum)
    }
}