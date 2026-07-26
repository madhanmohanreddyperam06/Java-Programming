// using while loop, print even numbers in 1-10 numbers

public class Even{
    public static void main(String[] args){
        int n=1;
        while(n<=10){
            if(n%2==0){
                System.out.println(n);
            }
            n++;
        }
    }
}