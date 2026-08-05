// pattern 21

// 4321
// 4321
// 4312
// 4123 

public class P21{
    public static void main(String[] args){
        int row=4, column=4;
        for(int i=1;i<=row;i++){
            int n1=4, n2=1;
        for(int j=1;j<=column;j++){
            if(i+j>5){
                System.out.print(n2);
                n2++;
            }
            else{
                System.out.print(n1);
                n1--;
            }
        }
        System.out.println();
        }
    }
}