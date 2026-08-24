// print prime numbers from a given range

public class PrimeNums{
    public static void main(String[] args){
        int m = 10;
        int n = 30;
        for(int i=m;i<=n;i++){
            int a=i;
            int f=1, count=0;
            while(f<=a){
                if(a%f==0){
                    count++;
                }
                f++;
            }
            if(count==2){
                System.out.println(a);
            }
        }
    } 
}