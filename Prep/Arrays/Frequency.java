// find the count of each element present in an array
    
public class Frequency{
    public static void main(String[] args){
        int arr[] = {10,9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9,10,10,9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            boolean flag = false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(arr[i] + "->" + count);
            }
        }
    }
}