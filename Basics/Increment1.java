public class Increment1{
    public static void main(String[] args){
        int a = 5;
    int b = 10;
    int c = 15;

a = ++a + b-- - c++;

b = a-- + --b + ++c;

c = --c + ++a - b--;

System.out.println(a);
System.out.println(b);
System.out.println(c);

    }
}