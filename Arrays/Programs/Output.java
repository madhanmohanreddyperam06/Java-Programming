// a3b2c3d1 - aaabbcccd

/*public class Output {
    public static void main(String[] args){
        String s = "a3b2c3d1";
        String d = "";
        for (int i = 0; i < s.length(); i += 2){
            char ch = s.charAt(i);
            int count = s.charAt(i + 1) - '0';
            for (int j = 0; j < count; j++){
                d = d + ch;
            }
        }
        System.out.println(d);
    }
}*/


public class Output{
    public static void main(String[] args){
        String s="a3b2c3d1";
        String result="";
        for(int i=1;i<s.length();i+=2){
            char d = s.charAt(i);
            char ch=s.charAt(i-1);
            for(char c='1';c<=d;c++){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}