// print the distinct elements 

public class Distinct{
    public static void main(String[] args){
        int arr[] = {9,2,8,3,7,4,7,5,7,4,9,2,9,2,3,1};
        int visited = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=visited;
                }
            }
            if(arr[i]!=visited){
                System.out.print(arr[i] + " ");
            }
        }
    }
}