// disarium number


public class Disarium{
    public static void main(String[] args) {
        int n = 135;
        int temp = n;

        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;
        int position = digits;

        while (temp > 0) {
            int rem = temp % 10;

            int power = 1;
            for (int i = 1; i <= position; i++) {
                power *= rem;
            }

            sum += power;
            position--;
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");
    }
}