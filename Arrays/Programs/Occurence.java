public class Occurence{
    public static void main(String[] args){
        String s = "abaacbdb";
        char ch = 'a';
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
