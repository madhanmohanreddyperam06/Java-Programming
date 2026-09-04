// Right Rotation

public class RightRotation{
    public static void main(String[] args){
        int a[] = {10,20,30,40,50};
        int n = 2;
        for(int i=1;i<=n;i++){
            int first = a[a.length-1];
            for(int j=a.length-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0] = first;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}