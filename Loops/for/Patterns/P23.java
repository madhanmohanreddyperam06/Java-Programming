// pattern23

//    1
//   23
//  345
// 4567

public class P17{
    public static void main(String[] args){
        int n=4, st=1, sp=3;
        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                System.out.print(num);
                num++;
            }
            st++;
            sp--;
            System.out.println();
        }
    }
}