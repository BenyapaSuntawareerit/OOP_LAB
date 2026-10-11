package lab4;

public class UndergradStudent extends PSUStudent {
    private int currentYear;

    public UndergradStudent(int age, double gpa) {
        super(age, gpa);
        if (age < 0 && (gpa < 0.0 || gpa > 4.0)) {
            throw new IllegalArgumentException("Age cannot be negative and GPA must be between 0.0 and 4.0");
        } else if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        currentYear = 1;
    }

    @Override
    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public void setPassThesis(boolean pass) {

    }

    @Override
    public double revealGrade() {
        if (currentYear >= 4) {
            return gpa;
        }
        return 0.0d;
    }
}


