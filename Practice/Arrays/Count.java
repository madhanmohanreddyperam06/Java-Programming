// Count the elements present in arrays

public class Count{
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,5,6,7,8};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        System.out.println("Number of Elements in Array is : " + count);
    }
}