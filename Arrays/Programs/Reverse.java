// Reverse an array 

public class Reverse{
    public static void main(String[] args){
        
        //using two point operator method
        int[] arr = {10,20,30,40};
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            int temp = arr[p2];
            arr[p2] = arr[p1];
            arr[p1] = temp;
            p1++;
            p2--;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println(" ");

        //using normal reverse method
        int[] arr1 = {10,20,30,40};
        int i = arr1.length-1;
        while(i>=0){
            System.out.print(arr1[i] + " ");
            i--;
        }

    }
}