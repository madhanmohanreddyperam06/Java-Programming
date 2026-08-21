// Encapsulation --> the process of wrapping properties and methods into a single class unit and restricting the direct access to the data

public class Student{
    private String name;
    private int id;
    private int marks;
    Student(String name, int id, int marks){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }else{
            System.out.println("Invalid Marks, Please Enter Valid Marks!");
        }
    }
}