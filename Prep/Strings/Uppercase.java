// convert the given lowercase string into uppercase without using toUpperCase() method

public class Uppercase{
    public static void main(String[] args){
        String s = "programming123";
        String res = "";
        for(int i=0;i<s.length();i++){
                res=res+(char)(s.charAt(i)-32);
        }
        System.out.println(res);
    }
}