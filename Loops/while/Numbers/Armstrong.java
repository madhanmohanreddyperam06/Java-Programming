
// check whether the number is Armstrong num or not


public class Armstrong{
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int digits = 0;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        // Calculate sum of digits raised to the power of digits
        while (temp > 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, digits);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is Not an Armstrong Number");
        }
    }
}