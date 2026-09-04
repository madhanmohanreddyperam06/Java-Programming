
public class SumEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println("The sum of even array elements is: " + evenSum);
        System.out.println("The sum of odd array elements is: " + oddSum);
    }
}