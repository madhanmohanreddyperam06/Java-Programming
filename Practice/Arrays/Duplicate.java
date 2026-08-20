// print duplicate values in an array

public class Duplicate{
    public static void main(String[] args){
        int[] arr={9,8,7,6,5,4,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicates : " + arr[i]);
                    break;
                }
            }
        }
    }
}