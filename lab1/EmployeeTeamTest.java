package lab1;

public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee boss = new Employee("Somchai", "Sunton", 70000);
        Employee employee = new Employee("Benyapa", "Suntawareerit", 20000);
        EmployeeTeam team = new EmployeeTeam(boss, employee);

        team.printEmployeeDetails();

        team.printAllEmployeesDetails();

        team.updateSalaryOfEmployee("Benyapa", 25000);
        team.printAllEmployeesDetails();

        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}
