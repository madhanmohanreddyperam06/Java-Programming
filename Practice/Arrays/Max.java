// find the maximum element in arrays

public class Max{
    public static void main(String[] args){
        
        //for 1D-Array
        int arr[] = {2,3,1,4,5,6,9};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Value in 1D-Array is : " + max);

        //for 2D-Array
        int arr1[][] = {{8,10,3},{9,5,3}};
        int max1 = Integer.MIN_VALUE;
        for(int j=0;j<arr1.length;j++){
            for(int k=0;k<arr1[j].length;k++){
                if(arr1[j][k] > max1){
                    max1 = arr1[j][k];
                }
            }
        }
        System.out.println("Maximum Value in 2D-Array is : " + max1);
    }
}