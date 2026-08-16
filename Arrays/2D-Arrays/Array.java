//Multi-Dimensional Arrays/2D Arrays

public class Array{
    public static void main(String[] args){

        //create a 2D Array 
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //prints the elements
        //System.out.println(arr[1][1]); //5
        //System.out.println(arr[2][2]); //9

        //change element values
        //arr[2][1]=11; //replaces 8 into 11
        //System.out.println(arr[2][1]);
        
        //print length of rows and columns
        int [][] arr1 = {{1,2,3},{7,3,7,9}};

        //print length of rows
        System.out.println("Length of Rows : " + arr1.length);
        
        //print length of columns in each row
        System.out.println("Length of col0 : " + arr1[0].length);
        System.out.println("Length of col1 : " + arr1[1].length);
    }
}