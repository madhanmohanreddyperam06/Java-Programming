// india- find the substrings which have atleast 1 vowel

public class SubString1{
    public static void main(String[] args){
        String s = "india";
        String v = "aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            int count = 0;
            String s1="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(v.contains(ch+"")){
                    count++;
                }
                s1+=ch;
                if(count>=1)
                    System.out.println(s1);
            }
        }
    }
}