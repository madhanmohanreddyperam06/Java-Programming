// find the maximum element in a given array

public class Max{
    public static void main(String[] args){
        int arr[] = {72,93,73,82,92,34};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is : " + max);

        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max)
        //         max=arr[i];
        // }
        // System.out.println("Max Element is : " + max);
    }
}