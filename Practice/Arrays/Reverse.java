// print the reversed array

public class Reverse{
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3,4,5,6,7,8,7};
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}