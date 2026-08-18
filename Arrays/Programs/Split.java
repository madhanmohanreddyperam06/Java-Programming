public class Split{
    public static void main(String[] args){
        String s = "this is a class";
        String st[] = s.split(" ");
        for(int i=0;i<st.length;i++){
            System.out.println(st[i]);
        }
    }
}
