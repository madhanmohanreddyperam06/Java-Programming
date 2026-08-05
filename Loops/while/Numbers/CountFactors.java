// count the number of factors for a given number

public class CountFactors{
    public static void main(String[] args){
        int n=18;
        isFactorsCount(n);
    }
    public static void isFactorsCount(int n){
        int f=1, count=0;
        while(f<=n){
            if(n%f==0){
                count++;
            }
            f++;
        }
        System.out.println(count);
    }
}