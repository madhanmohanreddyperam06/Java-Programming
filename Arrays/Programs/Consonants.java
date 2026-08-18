// find duplicate consonants in a string

public class Consonants{
    public static void main(String[] args){
        String s = "aaaabb3*7$*3kelek";
        String d = "";
        String visited = "aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            int count = 1;
            char ch = s.charAt(i);
            if(!d.contains(ch+"") && ((ch>='A' && ch<='Z')||(ch>'a' && ch<='z')) && !visited.contains(ch+"")){
                for(int j=i+1;j<s.length();j++){
                    if(ch==s.charAt(j)){
                        count++;
                    }
                }
                if(count>1){
                    d=d+ch;
                    System.out.println(ch);
                }
            }
        }
    }
}