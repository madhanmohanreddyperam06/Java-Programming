// designing one if block inside if block is known as NestedIf


public class NestedIfElse{
    public static void main(String[] args){
        char ch='C';
        if((ch>='A' && ch<='z') || (ch>='a' && ch<='z')){
            if((ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U') || (ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u')){
                System.out.println(ch+ " is a vowel");
            }else{
                System.out.println(ch+ " is a consonant");
            }
        }
    }
}