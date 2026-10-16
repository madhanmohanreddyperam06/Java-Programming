// count number of vowels and consonants present in a given string

public class VowAndCons{
    public static void main(String[] args){
        String s = "Programming";
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("The Vowels Count is : " + vowels);
        System.out.println("The Consonants Count is : " + consonants);
    }
}