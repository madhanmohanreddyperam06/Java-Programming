public class P15{
    public static void main(String[] args){
        int n=4, st=1;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=st;j++){
                System.out.print(num);
                num++;
            }
            st++;
            System.out.println();
        }
    }
}