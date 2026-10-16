// find the factors of a given number

public class Factors{
    public static void main(String[] args){
        int n=36;
        int factors=1;
        while(factors<=n){
            if(n%factors==0){
                System.out.println(factors);
            }
            factors++;
        }
    }
}