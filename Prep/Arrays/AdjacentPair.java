// print adjacent values if their addition equals to target element

public class AdjacentPair{
    public static void main(String[] args){
        int arr[] = {2,3,4,5,8,-1,9,-2};
        int t=7;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] + arr[i+1] == t){
                System.out.println(arr[i] + "&" + arr[i+1]);
            }
        }
    }
}