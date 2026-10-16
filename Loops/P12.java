public class P10{
    public static void main(String[] args){
        int row=7, sp=0, st=7;
        for(int i=1;i<=row; i++){
            for(int j=1;j<=sp; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                System.out.print("*");
            }
            if(i<4){
                st=st-2;
                sp++;
            }
            else{
                st=st+2;
                sp--;
            }
            System.out.println();
        }
    }


}