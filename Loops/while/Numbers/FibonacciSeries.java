// print the fibonacci series



public class FibonacciSeries{
    public static void main(String[] args){
        int a=0, b=1, res=0;
        System.out.println(a);
        System.out.println(b);
        while(res<10){
            res=a+b;
            a=b;
            b=res;
            System.out.print(res + " ");
           
        }
    }
}