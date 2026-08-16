// check whether the array is palindrome or not

public class Palindrome{
    public static void main(String[] args){
        int arr[] = {1,2,3,2,1};
        boolean palindrome = true;
        for(int i=0, j = arr.length - 1; i < arr.length / 2; i++, j--){
            if(arr[i]!=arr[j])
            palindrome = false;
            break;
        }
        if(palindrome){
            System.out.println("Array is Palindrome");
        }else{
            System.out.println("Array is not a Palindrome");
        }
    }
}