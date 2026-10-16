// sort the number in a proper order

public class Sort{
    public static void main(String[] args){
        int n = 298374651;
        int sort = 0;
        //ascending order
        // for(int i=1;i<=9;i++){
        //     int temp = n;
        //     while(temp>0){
        //         int rem = temp%10;
        //         if(rem==i){
        //             sort = (sort*10) + rem;
        //         }
        //         temp=temp/10;
        //     }
        // }
        // System.out.println("The Sorted Number is : " + sort);

        //descending order
        for(int i=9;i>=0;i--){
            int temp = n;
            while(temp>0){
                int rem=temp%10;
                if(rem==i){
                    sort = sort*10+rem;
                }
                temp=temp/10;
            }
        }
        System.out.println("The Sorted Number is : " + sort);
    }
}