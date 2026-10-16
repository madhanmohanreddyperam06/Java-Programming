public class Sort{
    public static void main(String[] args){
        int n = 8462410;
        int sort = 0;
        for (int i=1; i<=9; i--){
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