public class isSum{
    public static void main(String[] args){
        int m=1, n=10;
        isSum(1,10);
    }
    private static void isSum(int m, int n){
        int sum = 0;
        while (m<=10){
            sum = sum+m;
            m++;
        }
        System.out.println(sum);
    }
}