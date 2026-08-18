//looping through an array

public class LoopArray{
    public static void main(String[] args){
        //for loop
        String[] arr1 = {"Apple","Banana","Cherry","Orange"};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("=============================================================");
        
        //while loop
        String[] arr2 = {"Audi","Benz","Toyota","Swift"};
        int j=0;
        while(j<arr2.length){
            System.out.println(arr2[j]);
            j++;
        }
        System.out.println("=============================================================");
        //for-each loop
        String[] arr3 = {"India", "Australia", "England", "New Zealand"};
        for(String arr : arr3){
            System.out.println(arr);
        }
    }
}