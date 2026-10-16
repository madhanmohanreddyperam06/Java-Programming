// find the minimum element in a given array

public class Min{
    public static void main(String[] args){
        int arr[] = {92,83,84,73,93,90,20,29};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element is : " + min);

        // int min = Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<min)
        //         min = arr[i];
        // }
        // System.out.println("minimum Element is : " + min);       
    }
}