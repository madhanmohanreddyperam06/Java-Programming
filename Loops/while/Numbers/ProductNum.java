// find the product of digits in a given number

public class ProductNum{
    public static void main(String[] args){
        int n=45;
        isProduct(n);
    }
    public static void isProduct(int n){
        int product=1;
        while(n>0){
            int rem=n%10;
            product=product*rem;
            n=n/10;
        }
        System.out.println(product);
    }
}