// check whether the number is Happy number or not


public class HappyNum {
    public static void main(String[] args) {
        int n = 19;
        isHappy(n);
    }
    public static void isHappy(int n) {
        int temp = n;
        int sum = 0;
        while (n != 1 && n != 4) {
            while (n > 0) {
                int rem = n % 10;
                sum = sum + (rem * rem);
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1) {
            System.out.println(temp + " is a Happy Number");
        } else {
            System.out.println(temp + " is not a Happy Number");
        }
    }
}