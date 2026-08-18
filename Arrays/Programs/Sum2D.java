//find the sum of elements in a 2D-Array

public class Sum2D{
    public static void main(String[] args){
        int[][] arr = {{1,4,3,9,4,0,4},{9,4,8,3,9,8,3}};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}