// check whether the number is palindrome or not

public class Palindrome{
    public static void main(String[] args){
        int n = 123454321;
        int temp=n;
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println(temp + " is Palindrome Number");
        }else{
            System.out.println(temp + " is not a Palindrome Number");
        }
    }
}