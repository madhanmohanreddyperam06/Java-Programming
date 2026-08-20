// find the second largest number in an array

public class SecondLargest{
    public static void main(String[] args){
        int[] arr = {2,8,3,7,4,6,5};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second = max;
                max = arr[i];
            }else if(arr[i] > second && arr[i]!=max){
                second = arr[i];
            }
        }
        System.out.println("Largest Value is : " + max);
        System.out.println("Second Largest Value : " + second);
    }
}