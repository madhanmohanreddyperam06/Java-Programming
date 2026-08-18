public class UserLogic{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name="John";
        e1.id = 123;
        e1.salary = 3000;
        e1.designation = "Software Developer";
        e1.phn_number = 9283746574l;
        e1.getInfo();
System.out.println("===================================================================================");
        Employee e2 = new Employee();
        e2.name="Mary";
        e2.id = 124;
        e2.salary = 4000;
        e2.designation = "Frontend Developer";
        e2.phn_number = 9287364374l;
        e1.getInfo();
    }
}