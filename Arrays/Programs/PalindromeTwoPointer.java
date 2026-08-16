public class PalindromeTwoPointer{
    public static void main(String[] args){
        String s = "level";
        boolean flag = true;
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
        }
        if(flag)
        System.out.println(s + " - is Palindrome String");
        else
        System.out.println(s + " - is not a Palindrome String");
    }
}