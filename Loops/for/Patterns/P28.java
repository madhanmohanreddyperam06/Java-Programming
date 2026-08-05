// pattern15

//    1
//   121
//  12321
// 1234321

public class P28{
    public static void main(String[] args){
        int n=4,st=1,sp=3;
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                if(k<=st/2){
                    System.out.print(num);
                    num++;
                }else{
                    System.out.print(num);
                    num--;
                }
            }
            st=st+2;
            sp--;
            System.out.println();
        }
    }
}