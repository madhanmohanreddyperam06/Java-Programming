// check whether the number is prime number or not

public class Prime{
    public static void main(String[] args){
        int n = 16;
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n + " is a Prime Number");
        }else{
            System.out.println(n + " is not Prime Number");
        }
    }
}