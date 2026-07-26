// check whether given character is alphabet or not

public class AlphabetOrNot{
    public static void main(String[] args){
        char ch='&';
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            System.out.println(ch+ " is Alphabet");
        }else{
            System.out.println(ch+ " is not Alphabet");
        }
    }
}