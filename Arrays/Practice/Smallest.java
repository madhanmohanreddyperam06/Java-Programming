
public class Smallest {
    public static void main(String[] args) {
        int a[]={4,13,4,-5,7,6};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
        }
}
