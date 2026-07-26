// using for loop, print numbers from 1 to 20
// but i don't want number 15 and 17, soo skip those numbers and print numbers from 1 to 20


public class Continue{
    public static void main(String[] args){
        for(int i=1;i<=20;i++){
            if(i==15){
                continue;
            }
            System.out.println(i);
        }
    }
}