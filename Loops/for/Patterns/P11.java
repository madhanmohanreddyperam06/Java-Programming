// pattern11

// *******
// *** ***
// **   **
// *     *

public class P11 {
    public static void main(String[] args) {
        int n = 4,st = 4,sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                if (i == 1 && j == 1)
                    continue;  
                System.out.print("*");
            }
            st--;
            if (i == 1)
                sp = 1;      
            else
                sp += 2;    
            System.out.println();
        }
    }
}