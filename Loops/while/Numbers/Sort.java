// sort the digits/elements in a given number in a sequential order


public class Sort{
    public static void main(String[] args){
        int n = 846241;
        int sort = 0;
        for (int i=1; i<=9; i++){
            int temp=n;
            while(temp>0){
                int rem = temp%10;
                if (rem==i){
                    sort = (sort*10)+rem;
                
                }
                temp = temp/10;
            }
        }
        System.out.println(sort);
    }
}