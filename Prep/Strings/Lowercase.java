// convert the given Uppercase string into lowercase string

public class Lowercase{
    public static void main(String[] args){
        String s = "PROGRAMMING";
        String result = "";
        for(int i=0;i<s.length();i++){
            result=result+(char)(s.charAt(i)+32);
        }
        System.out.println("The Lowercase String is : " + result);
    }
}