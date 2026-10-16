public class P20{
    public static void main(String[] args){
        int n=7, st=1, sp=3; int m=1;
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                if(k<=st/2){
                    System.out.print(num);
                    num++;
                }
                else{
                    System.out.print(num);
                    num--;
                }
            }
            if(i<4){
                st=st+2;
                sp--;
                m++;
            }
            else{
                st=st-2;
                sp++;
                m--;
            }
            System.out.println();
        }
    }
}