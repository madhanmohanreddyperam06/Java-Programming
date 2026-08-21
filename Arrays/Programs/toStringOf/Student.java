// toString() method

public class Student{
    String name;
    int id;
    double marks;
    Student(String name, int id, double marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }
    public String toString(){
        return "Name : " + name + ", ID : " + id + ", Marks : " + marks;
    }
}