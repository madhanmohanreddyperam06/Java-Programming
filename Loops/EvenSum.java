public class EvenSum{
	public static void main(String[] args){
	int m=1, n=10;
	int sum=0;
	while(m>=n){
		if(m%2==0){
			sum = sum+n;
			m++;
			}
			System.out.println(sum);
		}
	}
}