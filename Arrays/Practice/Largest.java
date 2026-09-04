
public class Largest {
    public static void main(String[] args) {
        int a[]={4,13,4,-5,7,6};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}