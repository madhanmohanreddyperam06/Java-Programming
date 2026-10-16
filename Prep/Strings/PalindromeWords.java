// find palindrome words in a given sentence

public class PalindromeWords{
    public static void main(String[] args){
        String s = "hii madam how are you";
        String st[] = s.split(" ");
        for(int i=0;i<st.length;i++){
            String s1 = st[i];
            String rev = "";
            for(int j=s1.length()-1;j>=0;j--){
                rev = rev + s1.charAt(j);                
            }
            if(s1.equals(rev)){
                System.out.println(s1);
            }
        }
    }
}