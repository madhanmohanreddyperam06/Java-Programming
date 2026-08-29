public class SingleSumDigits{
    public static void main(String[] args){
        int n = 1234;
        while(n>=10){
            int sum = 0;
            while(n>0){
                sum = sum + n%10;
                n=n/10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}