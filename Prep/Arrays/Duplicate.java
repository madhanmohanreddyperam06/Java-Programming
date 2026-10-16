// find duplicate elements in an array

public class Duplicate{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,30,20,50,60,60};
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                boolean flag = false;
                for(int k=0;k<i;k++){
                    if(arr[i]==arr[k]){
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}