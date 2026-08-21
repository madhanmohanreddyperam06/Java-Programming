//NullPointer Exception

public class NE{
    public static void main(String[] args){
        String s = null;
        System.out.println("Main Starts");
        try{
            System.out.println(s.toLowerCase());
        }catch(NullPointerException e){
            System.out.println("String is null");
        }finally{
            System.out.println("Finally block is executed");
        }
        System.out.println("Main Ends");
    }
}