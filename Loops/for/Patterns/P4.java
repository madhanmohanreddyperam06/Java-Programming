// pattern4

//  **&*
//  *$**
//  @***
//  ***^

public class P4{
    public static void main(String[] args){
        int row=4,col=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 && j==3){
                    System.out.print("&");
                }else if(i==2 && j==2){
                    System.out.print("$");
                }else if(i==3 && j==1){
                    System.out.print("@");
                }else if(i==4 && j==4){
                    System.out.print("^");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}