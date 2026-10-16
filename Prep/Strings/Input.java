// convert the string from aabbbcccdd into a2b3c3d2

public class Input{
    public static void main(String[] args){
        String s = "aabbbcccdd";
        String result = "";
        for(int i=0;i<s.length();i++){
            int count = 1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            result = result+s.charAt(i)+count;
        }
        System.out.println(result);
    }
}