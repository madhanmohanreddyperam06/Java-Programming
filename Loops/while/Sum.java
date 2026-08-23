// find the sum of first 10 natural numbers

public class Sum{
    public static void main(String[] args){
        int n = 1;
        int sum = 0;
        while(n<=10){
            if(n%2==0){
                sum = sum+n;
            }
            n++;
        }
        System.out.println(sum);
    }
}