// Print the Department Name according to the Department Number

public class Department{
    public static void main(String[] args){
        int a =11;
        if(a<10){
            System.out.println("Civil");
        }
        else if(a>11){
            System.out.println("ECE");
        }else if(a==11){
            System.out.println("CSE");
        }else{
            System.out.println("Mechanical");
        }
    }
}