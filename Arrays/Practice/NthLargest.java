// find the nth largest element in an array without sorting the array

public class NthLargest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int nthMax = Integer.MAX_VALUE;
        int n = 3;
        for(int i=1;i<=n;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<a.length;j++){
                if(a[j]>max &&  a[j]<nthMax){
                    max = a[j];
                }
            }
            nthMax = max;
        }
        System.out.println(nthMax);
    }
}