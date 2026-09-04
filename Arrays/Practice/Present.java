
public class Present {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int t = 9;
        boolean isPresent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("Element " + t + " is found in the array.");
        } else {
            System.out.println("Element " + t + " is not found in the array.");
        }
    }
}