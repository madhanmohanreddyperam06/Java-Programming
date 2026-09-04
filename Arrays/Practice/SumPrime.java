// find the sum of prime elements in an array

public class SumPrime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int primeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeSum += arr[i];
            }
        }
        System.out.println("The sum of prime array elements is: " + primeSum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}