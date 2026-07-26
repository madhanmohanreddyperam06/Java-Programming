// using for loop we can print numbers from 1 to 10
// but we need 1 to 7 and 8,9,10 are not needed ---> here we can use break to stop the iteration that do not proceed after 7

public class Break{
    public static void main(String[] args){
        for(char ch=65;ch<=90;ch++){
            System.out.println(ch);
            if(ch==89){
                break;
            }
        }
    }
}