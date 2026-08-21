public class UserLogic{
    public static void main(String[] args){
    Student s1 = new Student("Vishnu", 23, 97);

    System.out.println(">>>>>>>>>>>>>>>MARKS DETAILS<<<<<<<<<<<<<<<<<<<<");
    System.out.println("NAME : " + s1.getName());
    System.out.println("ID : " + s1.getID());
    System.out.println("MARKS : " + s1.getMarks());
    s1.setMarks(98);
    System.out.println("Updated Marks : " + s1.getMarks());
    }
}