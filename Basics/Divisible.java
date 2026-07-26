// check whether the number is divisible by 5 and 6

public class Divisible{
    public static void main(String[] args){
        int num=30;
        if(num%5==0 && num%6==0){
            System.out.println(num+ " is divisible by 5 and 6");
        }else{
            System.out.println(num+ " is not divisible by 5 and 6");
        }
    }
}