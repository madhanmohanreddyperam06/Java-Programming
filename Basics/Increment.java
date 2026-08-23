//increment and decrement
public class Increment{
    public static void main(String[] args){
        int a = 12, b = 6, c = 9;
        a = a++ - ++b + --c;
        b = b-- - ++a + c++;
        c = --c - a-- + b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        
    }
}