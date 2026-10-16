// check whether the number is armstrong number or not

public class Armstrong{
    public static void main(String[] args){
        int n = 1534;
        int temp = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(n>0){
            int rem = n%10;
            sum = sum + (int) Math.pow(rem, digits);
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp + " is Armstrong Number");
        }else{
            System.out.println(temp + " is not Armstrong Number");
        }
    }
}