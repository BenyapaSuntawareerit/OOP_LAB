package lab2;

public class Mother extends Parent {
    private Father husband;

    public Mother() {
        super(0);
    }

    @Override
    public String getFirstName() {
        return "Ms." + firstName;
    }
}
