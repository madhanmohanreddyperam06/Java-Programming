public class RevString{
    public static void main(String[] args){
        String s="srikanth";
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        System.out.println("Reversed String is : " + rev);
        
        System.out.println("====================================================================");

        String s1 = "madhan";
        String rev1 = "";
        for(int j=s1.length()-1; j >= 0;j--){
            rev1=rev1+s1.charAt(j);
        }
        System.out.println("Reversed String is : " + rev1);

    }
}