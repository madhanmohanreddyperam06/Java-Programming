// print adjacent elements of an array whose sum is equal to a target number

public class Adjacent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0};
        int target = 5;

        System.out.println("Adjacent elements whose sum is equal to " + target + ":");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                System.out.println(arr[i] + " & " + arr[i + 1]);
            }
        }
    }
}