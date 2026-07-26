// using do while loop, print only odd numbers in 1-20

public class OddNum{
    public static void main(String[] args){
        int n=1;
        do{
            if(n%2!=0){
                System.out.println(n);
            }
            n++;
        }
        while(n<=20);
    }
}