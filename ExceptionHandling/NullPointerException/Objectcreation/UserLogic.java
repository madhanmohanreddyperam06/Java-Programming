public class UserLogic{
    public static void main(String[] args){
        Student s = new Student(null);
        try{
            s.details();
        }catch(NullPointerException e){
            System.out.println("String cannot be null");
        }
    }
}