public class MaxLengthWord{
    public static void main(String[] args){
        String s = "this is a programming class";
        String st[] = s.split(" ");
        String max = "";
        for(int i=0; i<st.length;i++){
            if(st[i].length() > max.length()){
                max = st[i];
            }
        }
        System.out.println(max);
    }
}