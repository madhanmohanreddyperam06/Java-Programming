// find the second largest element in an array

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {7, 18, 9, 14, 13, 6};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        Systm.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        if (smax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is: " + smax);
        }
    }
}
