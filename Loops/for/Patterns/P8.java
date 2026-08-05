// pattern8

// ****
//  ***
//   **
//    *

public class P8{
    public static void main(String[] args) {

        int rows = 4, col = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}