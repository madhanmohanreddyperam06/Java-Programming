// check whether the given character is vowel or consonant

public class VowelOrConsonant{
    public static void main(String[] args){
        char ch='j';
        if((ch=='A') || (ch=='a') || (ch=='E') || (ch=='e') || (ch=='I') || (ch=='i') || (ch=='O') || (ch=='o') || (ch=='U') || (ch=='u')){
            System.out.println(ch+ " is a Vowel");
        }else{
            System.out.println(ch+ " is a Consonant");
        }
    }
}