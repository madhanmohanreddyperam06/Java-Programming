// check whether the number is Harshad Number or not

public class Harshad{
    public static void main(String[] args){
        int n = 81;
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n=n/10;
        }
        if(temp%sum==0){
            System.out.println(temp + " is a Hashad Number");
        }else{
            System.out.println(temp + " is not a Harshad Number");
        }
    }
}