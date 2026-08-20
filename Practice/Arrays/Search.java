// searching an element in array

public class Search{
    public static void main(String[] args){
        int[] arr = {1,8,2,6,3,0};
        int search = 3;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == search){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(search + " - Element found");
        }else{
            System.out.println(search + " - Element not found");
        }
    }
}