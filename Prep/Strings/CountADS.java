// count the number of alphabets,digits and special characters present in a given string

public class CountADS{
    public static void main(String[] args){
        String s = "programming@123#";
        int vowels = 0;
        int digits = 0;
        int specialCharacters = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
                vowels++;
            }else if(ch>='0'&&ch<='9'){
                digits++;
            }else{
                specialCharacters++;
            }
        }
        System.out.println("The Vowels Count is : " + vowels);
        System.out.println("The Digits Count is : " + digits);
        System.out.println("The SpecialCharacters Count is : " + specialCharacters);
    }
}