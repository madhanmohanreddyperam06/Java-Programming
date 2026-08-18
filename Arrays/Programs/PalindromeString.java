/*public class PalindromeString{
    public static void main(String[] args){
        String s="madam";
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        if(rev.equals(s)){
            System.out.println(s + " is a Palindrome String");
        }else{
            System.out.println(s + " is not a palindrome String");
        }
    }
}*/


public class PalindromeString{
    public static void main(String[] args){
        String s="levels";
        String rev = "";
        for(int i=0;i<s.length();i++){
            rev = s.charAt(i)+rev;

        }
        if(s.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}