package lab4;

public class GradStudent extends PSUStudent {
    private boolean passThesis;

    public GradStudent(int age, double gpa) {
        super(age, gpa);
        if (age < 0 && (gpa < 0.0 || gpa > 4.0)) {
            throw new IllegalArgumentException("Age cannot be negative and GPA must be between 0.0 and 4.0");
        } else if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        passThesis = false;
    }

    @Override
    public void setPassThesis(boolean passThesis) {
        this.passThesis = passThesis;
    }

    @Override
    public void setCurrentYear(int year) {
        // Not applicable to graduate students
    }

    @Override
    public double revealGrade() {
        if (passThesis) {
            return gpa;
        }
        return 0.0d;
    }
}


