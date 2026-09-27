package lab2;

public class Child extends Person {
    private Person guardian;
    private int age;
    private int height;
    private double weight;

    public Child(int age, int height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setGuardian(Person guardian) {
        this.guardian = guardian;
    }

    public Person getGuardian() {
        return guardian;
    }
}
