package lab1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee a = new Employee("Benyapa", "Suntawareerit", 20000);

            System.out.println("Employee_a: "+a.getFirst_name()+" "+a.getLast_name()+" Salary: "+a.getMonthly_salary());
        

        a.setFirst_name("Somchai");
        a.setLast_name("Sunton");
        a.setMonthly_salary(70000);

            System.out.println("Employee_a: "+a.getFirst_name()+" "+a.getLast_name()+" Salary: "+a.getMonthly_salary());
        
        Employee employee1 = new Employee("Benyapa", "Suntawareerit", 20000);
            System.out.println("Employee1 yearly_salary: "+employee1.getYearly_salary());
        Employee employee2 = new Employee("Somchai", "Sunton", 70000);
            System.out.println("Employee2 yearly_salary: "+employee2.getYearly_salary());

        employee1.Give_raise();
            System.out.println("10% raise of employee1: "+employee1.getYearly_salary());
        employee2.Give_raise();
            System.out.println("10% raise of employee2: "+employee2.getYearly_salary());
    }
}
