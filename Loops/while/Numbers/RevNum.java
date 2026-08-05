// reverse the given number without using a string


public class RevNum{
    public static void main(String[] args){
        int n=745;
        isRev(n);
    }
    public static void isRev(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}