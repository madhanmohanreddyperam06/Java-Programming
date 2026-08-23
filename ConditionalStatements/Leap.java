// check the year is a leap year or not


public class Leap{
    public static void main(String[] args){
        int n = 2076;
        if((n%4==0 && n%100!=0)||(n%400==0)){
            System.out.println(n + " is a Leap Year");  
        }else{
            System.out.println(n + " is not a Leap Year");
        }
    }
}