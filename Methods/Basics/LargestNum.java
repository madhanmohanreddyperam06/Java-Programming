public class LargestNum{
    public static int largest(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        int result=largest(20, 30);
        System.out.println("Largest Number is " + result);
    }
}