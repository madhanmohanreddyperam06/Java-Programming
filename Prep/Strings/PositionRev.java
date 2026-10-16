// reverse the words in a given sentence without changing words position

public class PositionRev{
    public static void main(String[] args){
        String s = "hii how are you madam";
        String reverse = "";
        String st[] = s.split(" ");
        for(int i=0;i<st.length;i++){
            String s1=st[i];
            String rev = "";
            for(int j=s1.length()-1;j>=0;j--){
                rev = rev + s1.charAt(j);
            }
            reverse = reverse + rev + " ";
        }
        System.out.println(reverse);
    }
}