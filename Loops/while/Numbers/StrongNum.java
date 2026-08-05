// check whether the number is Happy number or not


public class StrongNum{
    public static void main(String[] args) {
        int n = 145;
        isStrong(n);
    }
    public static void isStrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is a Strong Number");
        } else {
            System.out.println(temp + " is not a Strong Number");
        }
    }
}