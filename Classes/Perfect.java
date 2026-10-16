public class Perfect{
    public static void main(String[] args){
        int n=6;
        isPerfect(n);
    }
    public static void isPerfect(int n){
        int f=1, sum=0;
        while(f<n){
            if(n%f==0){
                sum=sum+f;
            }
            f++;
        }
        if (sum==n & n!=1){
            System.out.println(n+" is a Perfect Number");
        }
        else{
            System.out.println(n+" is not a Perfect Number");
        }
    }
}