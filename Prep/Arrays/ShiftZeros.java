// shift all zeros to last position

public class ShiftZeros{
    public static void main(String[] args){
        int a[] = {1,0,2,0,3,0,4,0,5,0};
        int b[] = new int[a.length];
        int k=0;
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