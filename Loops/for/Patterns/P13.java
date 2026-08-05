// pattern13

// 1
// 23
// 456
// 78910

public class P13{
    public static void main(String[] args){
        int n=4, st=1,num=1;
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