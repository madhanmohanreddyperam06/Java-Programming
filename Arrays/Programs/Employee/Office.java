public class Office{
    public static void main(String[] args){
        Employee emp[] = new Employee[5];
        Employee e1 = new Employee("Madhu",16,2500,"Software Developer");
        emp[0]=e1;
        emp[1]= new Employee("Pavan",17,2700,"Frontend Developer");
        emp[2]= new Employee("Vardhan",18,2800,"Backend Developer");
        emp[3]= new Employee("Siva",19,2900,"AI Developer");
        emp[4]= new Employee("Naveen",20,2800,"Python Developer");
        for(int i=0;i<emp.length;i++){
            System.out.println(emp[i]);
        }
        System.out.println("=====================AVG SALARY======================");
        double total = 0;
        for(int j=0;j<emp.length;j++){
            total = total + emp[j].salary;
        }
        double avg = total/emp.length;
        System.out.println("Average Salary is : " + avg);

        System.out.println("=====================Employee with Salary greater than Avg salary===========================");
        for (int k = 0; k < emp.length; k++) {
            if (emp[k].salary > avg) {
                System.out.println(emp[k]);
            }
        }
    }
}