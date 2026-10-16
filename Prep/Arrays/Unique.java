// find unique elements in an array

public class Unique{
    public static void main(String[] args){
        int arr[] = {10,20,30,30,50,40,50,60};
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}