// print factors of given number

public class Factors{
    public static void main(String[] args){
        int n=4;
        isFactors(n);
    }
    public static void isFactors(int n){
        int f=1;
        while(f<=n){
            if(n%f==0){
                System.out.println(f);
            }
            f++;
        }
    } 
}