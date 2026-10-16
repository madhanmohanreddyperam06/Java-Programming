public class Operators{
	public static void main(String[] args){
		int a=10,b=5, c=8;
		a = a-- + ++b + c++;
		b = b++ + ++c - a++;
		c = c++ - ++b + ++a;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}