public class Strong{
    public static void main(String[] args){
        int n =145;
        isHappy(n);
    }
    public static void isHappy(int n){
        int sum=0, temp=n;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
            if (n==0 && sum>9){
                n=sum;
                sum=0;
            }
        }
        if (n==1){
            System.out.println(temp + "is a Happy Number");
            }else{
                System.out.println(temp + " is not a Happy Number");
            }
    }
}