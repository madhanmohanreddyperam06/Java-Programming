//encapsulation

public class Student{
    private String name;
    private int age;
    private int marks;
    public Student(String name, int age, int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        if(marks>0 && marks<=100){
            this.marks=marks;
        }else{
            System.out.println("Invalid Marks");
        }
    }
}