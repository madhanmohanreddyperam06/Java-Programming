// check whether the array is palindrome or not
/*
public class Palindrome{
    public static void main(String[] args){
        int arr[] = {1,2,3,5,1};
        boolean palindrome = true;
        for(int i=0, j = arr.length - 1; i < arr.length / 2; i++, j--){
            if(arr[i]!=arr[j]){
            palindrome = false;
            break;
            }
        }
        if(palindrome){
            System.out.println("Array is Palindrome");
        }else{
            System.out.println("Array is not a Palindrome");
        }
    }
}*/

public class Palindrome{
    public static void main(String[] args){
        int[] arr = {10,20,30,20,10};
        boolean flag=true;
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            if(arr[i]!=arr[j]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        
    }
}