public class StudentDetails{
    public static void details(String name, int id, char Gender){
        System.out.println("Student Name is : " + name);
        System.out.println("Student ID is : " + id);
        System.out.println("Student Gender : " + Gender);        
    }
    public static void main(String[] args){
        details("Madhan", 41310, 'M');
    }
}