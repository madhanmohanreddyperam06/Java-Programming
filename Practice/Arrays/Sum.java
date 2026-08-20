// find the sum of elements in arrays

public class Sum{
    public static void main(String[] args){
        System.out.println("================SUM OF 1D-Array==========================");
        //for 1D-Array
        int arr[] = {9,8,1};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of 1D-Array : " + sum);


        System.out.println("==================SUM OF 2D-Array(rows)==================");
        //for 2D-Array
        int[][] arr1 = {{1,2,3},{23,24,25}};
        int sum1 = 0;
        for(int j=0;j<arr1.length;j++){
            for(int k=0;k<arr1.length;k++){
                sum1 = sum1+arr1[j][k];
            }
        }
        System.out.println("Sum of 2D-Array is : " + sum1);

        
        System.out.println("================SUM OF 2D-Arrays(for each row)============");
        //for 2D-Array(for each row)
        int[][] arr2 = {{7,4,6,3},{7,3,6,3}};
        for(int c=0;c<arr2.length;c++){
            int sum2=0;
            for(int d=0;d<arr2[c].length;d++){
                sum2 = sum2+arr2[c][d];
            }
            System.out.println("Sum of 2D-Array is(rows) " + sum2);
        }


        System.out.println("================SUM OF 2D-Array(columns)=================");
        //for 2D-Array(columns)
        int[][] arr3 = {{3,4,6},{8,3,8}};
        for(int a=0;a<arr3[0].length;a++){
            int sum3=0;
            for(int b=0;b<arr3.length;b++){
                sum3 = sum3+arr3[b][a];
            }
            System.out.println("Sum of 2D-Array(columns) : " + sum3);
        }
    }
}