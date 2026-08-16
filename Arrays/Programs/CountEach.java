//count the occurrences of each element in an array

public class CountEach{
    public static void main(String[] args){
        int[] arr = {9,8,3,4,8,2,3,8,3,2,9,2,9,2,3,8,4,8,4,7};
        int[] visited = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]!=1 && arr[i]%2==0){
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        visited[j]=1;
                    }
                }
                if(count==1)
                System.out.println(arr[i]);+
            }
        }
    }
}