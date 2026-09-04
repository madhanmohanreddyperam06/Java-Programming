// print the sum of any two elements is equal to target element

public class Any2Sum{
    public static void main(String[] args){
        int[] a = {3,4,2,0,1,6,-1,2};
        int t = 5;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }
    }
}