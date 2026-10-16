// count the characters in a given string

public class CountChar{
    public static void main(String[] args){
        String s = "Programming";
        int count = 0;
        for(int i=0;i<s.length();i++){
            count++;
        }
        System.out.println("The number of characters = " + count);
    }
}