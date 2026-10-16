// check whether the number is Neon Number or not

public class Neon{
    public static void main(String[] args){
        int n = 1;
        int sq= n*n;
        int sum = 0;
        while(sq>0){
            int rem = sq%10;
            sum = sum+rem;
            sq=sq/10;
        }
        if(n==sum){
            System.out.println(n + " is a Neon Number");
        }else{
            System.out.println(n + " is not a Neon Number");
        }
    }
}