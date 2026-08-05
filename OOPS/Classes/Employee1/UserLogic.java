class UserLogic {
    public static void main(String[] args) {

        Employee1 e1 = new Employee1("Madhan", 101, 55000, "Software Engineer");
        Employee1 e2 = new Employee1("Rahul", 102, 70000, "Senior Developer");

        if (e1.salary > e2.salary) {
            System.out.println("Employee with Highest Salary");
            e1.display();
        } else {
            System.out.println("Employee with Highest Salary");
            e2.display();
        }
    }
}