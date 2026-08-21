// count each occurrence of a distinct value in a string 

public class CountEach1{
    public static void main(String[] args){
        String s = "programming";
        String d = "";
        for(int i=0;i<s.length();i++){
            int count =1;
            char ch = s.charAt(i);
            if(! d.contains(ch + "")){
                for(int j=i+1;j<s.length();j++){
                    if(ch==s.charAt(j))
                    count++;
                }
                d=d+ch;
                System.out.println(ch + "->" + count);
            }
        }
    } 
}