// check whether the number is palindrome number or not


public class PalindromeNum{
    public static void main(String[] args) {
        int n = 12321;
        isPalindrome(n);
    }
    public static void isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println(temp + " is a Palindrome Number");
        } else {
            System.out.println(temp + " is not a Palindrome Number");
        }
    }
}