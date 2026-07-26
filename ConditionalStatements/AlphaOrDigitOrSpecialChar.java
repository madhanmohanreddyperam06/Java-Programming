// check whether the given character is alphabet/digit/special character

public class AlphaOrDigitOrSpecialChar{
    public static void main(String[] args){
        char ch='6';
        if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
            System.out.println(ch+ " is an Alphabet");
        }else if(ch>=48 && ch<=57){
            System.out.println(ch+ " is a Digit");
        }else{
            System.out.println(ch+ " is a Special Character");
        }
    }
}