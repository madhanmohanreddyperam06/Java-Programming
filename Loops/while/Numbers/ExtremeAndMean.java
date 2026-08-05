// find sum of extreme digits and mean of digits for a given number

public class ExtremeAndMean{
    public static void main(String[] args){
        int n=84674;
        isExtMean(n);
    }
    public static void isExtMean(int n){
        int ext=0, mean=0;
        ext=n%10;
        n=n/10;
        while(n>9){
            int rem=n%10;
            mean=mean+rem;
            n=n/10;
        }
        ext=ext+n;
        System.out.println(ext);
        System.out.println(mean);
    }
}