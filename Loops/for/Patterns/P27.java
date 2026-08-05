// pattern18

// 4321
// 432
// 43
// 4

public class P27{
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}