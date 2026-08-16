

public class Student{
    String name;
    int id;
    int age;
    char gender;
    double percentage;
    public Student(String name, int id, int age, char gender, double percentage){
        this.name=name;
        this.id=id;
        this.age= age;
        this.gender=gender;
        this.percentage=percentage;
    }
    public String toString(){
        return "[name = " + name + ", id = " + id + ", age =" + age + ", gender = " + gender + ", percentage = " + percentage + ",]";
    }
}