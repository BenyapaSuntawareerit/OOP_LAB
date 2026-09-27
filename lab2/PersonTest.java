package lab2;

public class PersonTest {
    public static void main(String[] args) {

        Mother m = new Mother();
        m.setFirstName("Alice");
        System.out.println("Mother name: "+ m.getFirstName());

        Father f = new Father(m);
        f.setFirstName("Bob");
        System.out.println("Father name: "+ f.getFirstName());

        Person p = new Person();
        p.setFirstName("John");
        System.out.println("Person name: "+ p.getFirstName());

        Child c = new Child(10, 140, 35.5);
        c.setGuardian(f);
        System.out.println("Child guardian: "+ c.getGuardian().getFirstName());

        System.out.println("Father wife: "+ f.getWife().getFirstName());

        f.setChild(c);
        System.out.println("Father's child guardian: "+ f.getChild().getGuardian().getFirstName());
    }
}