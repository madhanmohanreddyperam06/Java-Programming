// check whether the number is Magic Number or not

public class MagicNum{
    public static void main(String[] args){
        int n=901;
        isMagic(n);
    }
    public static void isMagic(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(sum==0 && sum>9){
            n=sum;
            sum=0;
        }
        if(sum==1){
            System.out.println(sum+ " is a Magic Number");
        }else{
            System.out.println(sum+ " is not a Magic Number");
        }
    }
}