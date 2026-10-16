// convert the string into lowercase

public class Lowercase1{
    public static void main(String[] args){
        String s = "PROGRamming@123";
        String result = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                result=result+(char)(s.charAt(i)+32);
            }else{
                result=result+s.charAt(i);
            }
        }
        System.out.println(result);
    }
}