// find the count of a character in a given string

public class Count1{
    public static void main(String[] args){
        String s = "Programming";
        char ch = 'P';
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Count of " + ch + " is " + count);
    }
}