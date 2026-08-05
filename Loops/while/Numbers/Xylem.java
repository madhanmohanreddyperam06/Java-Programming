// xylem number


public class Xylem{
    public static void main(String[] args) {
        int n = 121;

        int temp = n;
        int last = temp % 10;
        temp /= 10;

        int meanSum = 0;

        while (temp >= 10) {
            meanSum += temp % 10;
            temp /= 10;
        }

        int first = temp;
        int extremeSum = first + last;

        if (extremeSum == meanSum) {
            System.out.println(n + " is a Xylem Number");
        } else {
            System.out.println(n + " is a Phloem Number");
        }
    }
}