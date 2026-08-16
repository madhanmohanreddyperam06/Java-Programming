public class Employee{
    String name;
    int id;
    double salary;
    String designation;
    public Employee(String name, int id, double salary, String designation){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.designation=designation;
    }
    public String toString(){
        return "[name = " + name + ", id = " + id + ", salary =" + salary + ", desination = " + designation + ",]";
    }
}