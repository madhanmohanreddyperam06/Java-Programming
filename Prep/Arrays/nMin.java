// find nth minimum element in an array

public class nMin{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int nthMin = Integer.MIN_VALUE;
        int n = 3;
        for(int i=1;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<min && arr[j]>nthMin){
                    min = arr[j];
                }
            }
            nthMin = min;
        }
        System.out.println(nthMin);
    }
}