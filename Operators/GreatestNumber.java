public class GreatestNumber{
	public static void main(String[] args){
	int a=30, b=25, c=20;

	System.out.println((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));
	}
}