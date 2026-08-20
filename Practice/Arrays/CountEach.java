// find the count of each value in an array

public class CountEach{
    public static void main(String[] args){
        int[] arr = {8,7,6,5,4,3,4,5,6,7,8,9,8,7,6,5,4,3,2,3,4,5,6,7,1,2,3,4};
        int[] visited = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(visited[i]!=1){
                int count = 1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        visited[j]=1;
                    }
                }
                System.out.println(arr[i] + "->" + count);
            }
        }
    }
}