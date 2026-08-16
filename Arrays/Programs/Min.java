// find the minimum value in an array

public class Min{
    public static void main(String[] args){
        int[] arr={8,3,4,7,1,9};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Minimum Value is : " + min);
    }
}