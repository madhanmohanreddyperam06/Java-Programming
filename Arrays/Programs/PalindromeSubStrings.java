// find all the palindrome sub strings in the given string

public class PalindromeSubStrings {
    public static boolean palindrome(String s){
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abak12321kah5j5kak2";
        for(int i=0;i<s.length();i++){
            String s1=""+s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                s1+=s.charAt(j);
                if(palindrome(s1)){
                    System.out.println(s1);
                }
            }
        }
    }
}


// for (int i = 0; i < s.length(); i++) {
//     for (int j = i + 1; j <= s.length(); j++) {
//         String sub = s.substring(i, j);
//         boolean palindrome = true;
//         for (int k = 0; k < sub.length() / 2; k++) {
//             if (sub.charAt(k) != sub.charAt(sub.length() - 1 - k)) {
//                 palindrome = false;
//                 break;
//             }
//         }
//         if (palindrome && sub.length() > 1) {
//             System.out.println(sub);
//         }
//     }
// }
