/*find the greatest number in three numbers */

public class P4{
    public static void main(String[] args){
        int a=45, b=46, c=47;

        if(a>b && a>c){
            System.out.println(a + " is Greatest Number than " + b +  "and" + c);
        }else if(b>a && b>c){
            System.out.println(b + " is Greatest Number than " + a +  "and" + c);
        }else{
            System.out.println(c + " is Greatest Number than " + a +  "and" + b);
        }
    }
}