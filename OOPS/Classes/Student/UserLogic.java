public class UserLogic{
    public static void main(String[] args){
        Student s1=new Student("Madhan", 22, 95);
        System.out.println(">>>>>>>>>>>>>>>>STUDENT DETAILS<<<<<<<<<<<<<<<<<");
        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student Age : " + s1.getAge());
        System.out.println("Student Marks : " + s1.getMarks());
        s1.getMarks();
        s1.setMarks(96);
        System.out.println("Updated Marks : " + s1.getMarks());
    }
}