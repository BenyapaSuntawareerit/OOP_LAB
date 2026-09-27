package lab1;

public class Employee {

    private String First_name;
    private String Last_name;
    private double Monthly_salary;

    public Employee(String First_name, String Last_name, double Monthly_salary) {
        this.First_name = First_name;
        this.Last_name = Last_name;
        setMonthly_salary(Monthly_salary);
    }

    public Employee(String First_name, String Last_name) {
        this(First_name, Last_name, 0);
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public double getMonthly_salary() {
        return Monthly_salary;
    }

    public void setMonthly_salary(double Monthly_salary) {
        if (Monthly_salary > 0) {
            this.Monthly_salary = Monthly_salary;
        }
    }

    public double getYearly_salary() {
        return Monthly_salary * 12;
    }

    public void Give_raise() {
        Monthly_salary = Monthly_salary + (Monthly_salary * 0.1);
    }
}
