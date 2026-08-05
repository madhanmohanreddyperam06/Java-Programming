// find the sum of even numbers and odd numbers separately in a given number

public class SumEvenAndOdd{
    public static void main(String[] args){
        int n=1456;
        isSum(n);
    }
    public static void isSum(int n){
        int eSum=0, oSum=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                eSum=eSum+rem;
            }else{
                oSum=oSum+rem;
            }
            n=n/10;
        }
        System.out.println(eSum);
            System.out.println(oSum);
    }
}