// check whether the num is Evil Number or not


public class EvilNum{ 
    public static void main(String[] args){
        int n=15;
        int temp=n;
        int c=0;
        String bin="";
        while (n>0){
            int rem=n%2;
            if(rem==1){
                c++;
            }
            n=n/2;
        }
        if(c%2==0){
            System.out.println(temp+ " is a Evil Number");
        }else{
            System.out.println(temp+ " is a not Evil Number");
        }
    }
}