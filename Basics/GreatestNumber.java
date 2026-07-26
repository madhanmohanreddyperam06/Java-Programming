
// find the greatest number in three numbers

public class GreatestNumber{
    public static void main(String[] args){
        int a=11,b=12,c=45;
        System.out.println(a>b? (a>c? a:c):(b>c? b:c));
    }
}