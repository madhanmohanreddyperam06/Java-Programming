// check the number with following cases

// --- if num divisible by 5&6 both --> Good Morning
// --- if num divisible by 5 and not divisible by 6 --> Good Afternoon
// --- if num not divisible by 5 and divisible by 6 --> Good Evening
// --- if num is not divisible by both 5&6 --> Good Night



public class Divisibility{
    public static void main(String[] args){
        int num=24;
        if(num%5==0 && num%6==0){
            System.out.println("Good Morning");
        }else if(num%5==0 && num%6!=0){
            System.out.println("Good Afternoon");
        }else if(num%5!=0 && num%6==0){
            System.out.println("Good Evening");
        }else{
            System.out.println("Good Night");
        }
    }
}
