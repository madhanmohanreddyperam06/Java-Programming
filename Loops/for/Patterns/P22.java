// pattern22

// 4321
//  321
//   21
//    1


public class P22{
    public static void main(String[] args){
        int n=4, st=4, sp=0;
        for(int i=n;i>0;i--){
            int num=i;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                System.out.print(num);
                num--;
            }
            st--;
            sp++;
            System.out.println();
        }
    }
}