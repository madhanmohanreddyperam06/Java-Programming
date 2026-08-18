//print substrings of abcde of length 3

public class SubString{
    public static void main(String[] args){
        // String s = "abcde";
        // int l=3;
        // for(int i=0;i<=s.length()-l;i++){
        //     System.out.println(s.substring(i,i+l));
        // }

        String s = "abcde";
        int l = 3;
        for(int i=0;i<s.length()-l;j++){
            String s1="";
            for(int j=i;kj<i+1;j++){
                s1+=s.charAt(j);
            }
            System.out.println(s);
        }
    }
}