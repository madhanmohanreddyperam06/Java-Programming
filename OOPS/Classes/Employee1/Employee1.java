class Employee1{
    String name;
    int empId;
    double salary;
    String designation;

    Employee1(String name, int empId, double salary, String designation) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.designation = designation;
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Salary        : " + salary);
        System.out.println("Designation   : " + designation);
    }
}