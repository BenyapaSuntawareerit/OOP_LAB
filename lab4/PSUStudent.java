package lab4;

public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age, double gpa) {
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void setCurrentYear(int year);

    public abstract void setPassThesis(boolean pass);

    public abstract double revealGrade();
}

