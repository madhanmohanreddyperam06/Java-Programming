/*find the grade of a student with their marks percentage */

public class P7{
    public static void main(String[] args){
        double marksPercentage = 89.9;

        if(marksPercentage>90.0){
            System.out.println("Grade A");
        }else if(marksPercentage>80.0 & marksPercentage<90.0){
            System.out.println("Grade B");
        }else if(marksPercentage>70.0 && marksPercentage<80.0){
            System.out.println("Grade C");
        }else if(marksPercentage>60.0 && marksPercentage<70.0){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade E");
        }
    }
}