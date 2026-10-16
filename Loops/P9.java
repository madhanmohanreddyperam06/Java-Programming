public class P9{
    public static void main(String[] args){
        int row=7, sp=3, st=1;
        for(int i=1;i<=row; i++){
            for(int j=1;j<=sp; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                System.out.print("*");
            }
            if(i<4){
                st++;
                sp--;
            }
            else{
                st--;
                sp++;
            }
            System.out.println();
        }
    }


}