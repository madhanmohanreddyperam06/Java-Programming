public class UserLogic {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "Madhu";
        emp1.empID = 101;
        emp1.salary = 50000;
        emp1.designation = "Software Engineer";

        // Second Employee
        Employee emp2 = new Employee();
        emp2.name = "Rahul";
        emp2.empID = 102;
        emp2.salary = 65000;
        emp2.designation = "Senior Developer";

        // Print employee with highest salary
        System.out.println("Employee with Highest Salary:");
        if (emp1.salary > emp2.salary) {
            emp1.getInformation();
        } else {
            emp2.getInformation();
        }
    }
}