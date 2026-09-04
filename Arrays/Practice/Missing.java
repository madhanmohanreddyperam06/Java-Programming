// print the missing elements from a given target range

public class Missing {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 9, 11};
        int tStart = 1;
        int tEnd = 10;

        System.out.println("Missing elements in the range from " + tStart + " to " + tEnd + ":");
        for (int i = tStart; i <= tEnd; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
} 