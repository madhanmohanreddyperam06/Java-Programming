// check whether the array is palindrome or not

public class Palindrome{
    public static void main(String[] args){
        int arr[] = {10,20,30,20,10,40};
        boolean palindrome = true;
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            if(arr[i]!=arr[j]){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}