// check the number is prime num or not


public class Prime{
    public static void main(String[] args){
        int n=8;
        isPrime(n);
    }
    public static void isPrime(int n){
        int f=1,count=0;
        while(f<=n){
            if(n%f==0){
                count++;
            }
            f++;
        }
        if(count==2){
            System.out.println(n+ " is a Prime Number");
        }else{
            System.out.println(n+ " is not a Prime Number");
        }
    }
}