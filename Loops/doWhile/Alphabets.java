// using do while loop--> print alphabets from A - Z

public class Alphabets{
    public static void main(String[] args){
        char ch='A';
        do{
            System.out.println(ch);
            ch++;
        }
        while(ch<='Z');
    }
}