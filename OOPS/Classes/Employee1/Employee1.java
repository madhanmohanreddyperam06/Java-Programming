public class Employee1{
    String name;
    int id;
    double salary;
    String designation;
    public Employee1(String name, int id, double salary, String designation){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.designation=designation;
    }
    public void getDetails(){
        System.out.println(">>>>>>>>>>>>>>>>>EMPLOYEE DETAILS");
        System.out.println("Emp Name : " + this.name);
        System.out.println("Emp ID : " + this.id);
        System.out.println("Emp Salary : " + this.salary);
        System.out.println("Emp Designation : " + this.designation);
    }
}