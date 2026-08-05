// pattern3

//  ****
//  *$**
//  ****

public class P3{
    public static void main(String[] args){
        int row=3,col=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==2 && j==2){
                    System.out.print("$");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}