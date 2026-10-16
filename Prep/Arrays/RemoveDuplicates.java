// remove duplicate elements in a given array

public class RemoveDuplicates {
    public static void main(String[] args){
        int a[] = {9,8,7,6,0,3,8,0,8,3,0,0,2,7,3,0,8};
        int b[] = new int[a.length];
        int k = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}