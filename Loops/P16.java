public class P16{
    public static void main(String[] args){
        int n=1000, st=1;
        
        for(int i=1;i<=n;i++){
        int num=1;
            for(int j=1;j<=st;j++){
                System.out.print(num);
                num++;
            }
            st++;
            System.out.println();
        }
    }
}