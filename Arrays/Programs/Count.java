// find the count of element in a array

public class Count{
    public static void main(String[] args){
        int[] arr = {9,2,8,2,0,4,8,4,7,4,7,3,3,7,8,2};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==8)
            count++;
        }
        System.out.println(count);
    }
}