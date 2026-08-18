//looping through 2D Arrays

public class LoopArray{
    public static void main(String[] args){
        //using for loop iterating through a 2D Array
        int [][] arr = {{1,2,3},{4,5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            } 
        }
        System.out.println("=============================================================");
        
        //using for-each loop iterating through a 2D Array
        int[][] fruits = {{1,2,3},{1,2,3}};
        for(int[] i : fruits){
            for(int j : i){
                System.out.println(j);
            }
        }
        System.out.println("=============================================================");

        //using while loop iterating through a 2D Array

        int[][] num = {{1,3,4},{6,9,5}};
        int k=0;
        while(k<num.length){
            int q=0;
            while(q<num[k].length){
                System.out.println(num[k][q] + "");
                q++;
            }
            System.out.println();
            k++;
        }
    }
}