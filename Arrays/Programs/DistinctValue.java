public class DistinctValue{
    public static void main(String[] args){
        String s = "Programming";
        String res = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(! res.contains(ch + " ")){
                res += ch; 
            } 
        }
        System.out.println(res);
    }
}