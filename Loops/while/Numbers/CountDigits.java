// count the digits in a given number

public class CountDigits{
    public static void main(String[] args){
        int n=15488;
        isDigitCount(n);
    }
    public static void isDigitCount(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}