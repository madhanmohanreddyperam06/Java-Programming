// print tel series

public class TelSeries{
    public static void main(String[] args){
        int a=0, b=1, res=0, n;
        System.out.println(a);
        System.out.println(b);
        while(n<50){
            res=a+b;
            System.out.println(res);
            a=b;
            b=res;
        }
    }
}