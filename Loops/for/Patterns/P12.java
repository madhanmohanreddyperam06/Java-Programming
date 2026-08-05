// pattern12

// *     *
// **   **
// *** ***
// *******
// *** ***
// **   **
// *     *


public class P12{
    public static void main(String[] args) {
        int n=4, st=1, sp=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++)
                System.out.print("*");
            if (i == 4)
                System.out.print("*");
            for (int k = 1; k <= sp; k++)
                System.out.print(" ");
            for (int j = 1; j <= st; j++)
                System.out.print("*");
            if (i < 3)
                st++;
            sp -= 2;
            System.out.println();
        }
        st = 3;
        sp = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= st; j++)
                System.out.print("*");
            for (int k = 1; k <= sp; k++)
                System.out.print(" ");
            for (int j = 1; j <= st; j++)
                System.out.print("*");
            st--;
            sp += 2;
            System.out.println();
        }
    }
}