// find the minimum element in arrays

public class Min{
    public static void main(String[] args){
        
        //for 1D-Array
        int arr[] = {83,98,32,21};
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element is : " + min);

        //for 2d-Array
        int arr1[][] = {{2,3,4,5},{8,7,10,11}};
        int min1 = Integer.MAX_VALUE;
        for(int j=0;j<arr1.length;j++){
            for(int k=0;k<arr1[j].length;k++){
                if(arr1[j][k] < min1){
                    min1 = arr1[j][k];
                }
            }
        }
        System.out.println("Minimum value in 2D-Array is : " + min1);
    }
}