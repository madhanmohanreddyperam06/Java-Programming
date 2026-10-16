// find the nth maximum element in an array

public class nMax{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int nthMax = Integer.MAX_VALUE;
        int n =2;
        for(int i=1;i<=n;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>max && arr[j]<nthMax){
                    max = arr[j];
                }
            }
            nthMax = max;
        }
        System.out.println(nthMax);
    }
}