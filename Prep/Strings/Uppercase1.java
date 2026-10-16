// convert the given string into uppercase

public class Uppercase1{
    public static void main(String[] args){
        String s = "programming@123";
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                res = res+(char)(s.charAt(i)-32);
            }else{
                res=res+s.charAt(i);
            }
        }
        System.out.println(res);
    }
}