// pattern7

// ****
// ***
// **
// *

public class P7{
    public static void main(String[] args){
        int row=4,col=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }   
            col--;
            System.out.println();
        }
    }
}