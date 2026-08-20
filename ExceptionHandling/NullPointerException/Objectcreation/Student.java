// NullPointerException with object creation

public class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public void details(){
        System.out.println(">>>>>>>>STUDENT DETAILS<<<<<<<<<<<<");
        System.out.println("Student Name : " + this.name);
    }
}