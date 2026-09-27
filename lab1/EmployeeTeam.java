package lab1;

public class EmployeeTeam {

    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }
    public void printEmployeeDetails() {
        System.out.println("Employee_Details: "+employee.getFirst_name()+" "+employee.getLast_name()+" | Salary: "+employee.getMonthly_salary());
        System.out.println();
    }

    public void printAllEmployeesDetails() {
        System.out.println("All employee details:");
        System.out.println("Boss: "+boss.getFirst_name()+" "+boss.getLast_name()+" Salary: "+boss.getMonthly_salary());
        System.out.println("Employee: "+employee.getFirst_name()+" "+employee.getLast_name()+" | Salary: "+employee.getMonthly_salary());
        System.out.println();
    }
    

    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if (newSalary > 0) {
            if (boss.getFirst_name().equals(firstname)) {
                boss.setMonthly_salary(newSalary);
            }
            if (employee.getFirst_name().equals(firstname)) {
                employee.setMonthly_salary(newSalary);
            }
            System.out.println("- Update Salary -");
        }
    }

    public void giveRaiseToAllEmployees() {
        System.out.println("- 10% raise -");
        boss.Give_raise();
        employee.Give_raise();
    }
}
