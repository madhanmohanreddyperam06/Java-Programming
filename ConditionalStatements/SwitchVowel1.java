// using switch case find the character is vowel or consonant

public class SwitchVowel1{
    public static void main(String[] args){
        char ch='J';
        switch(ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vowel");
            break;
            default:{
            System.out.println("Consonant");
            break;
            }
        }
    }
}