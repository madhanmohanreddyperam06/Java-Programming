//check whether the array is palindrome or not

public class Palindrome{
    public static void main(String[] args){
        int[] arr = {8,4,8};
        boolean flag = true;
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j++){
            if(arr[i]!=arr[j]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Array is Palindrome");
        }else{
            System.out.println("Array is not Palindrome");
        }
    }
}