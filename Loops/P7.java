public class P7{
    public static void main(String[] args){
        int row=4, sp=0, st=7;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                System.out.print("*");
            }
            st-=2;
            sp++;
            System.out.println();
        }
    }
}