// print any pair in a array if their sum is equals to target element

public class AnyPair{
    public static void main(String[] args){
        int arr[] = {9,5,6,8,1,13,2,0,4,8,7,8};
        int t = 14;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    System.out.println(arr[i] + "&" + arr[j]);
                }
            }
        }
    }
}