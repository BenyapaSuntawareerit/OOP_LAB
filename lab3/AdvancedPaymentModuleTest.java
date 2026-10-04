package lab3;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule paymentModule = new AdvancedPaymentModule();

        Employee[] employees = {
            new Fulltimer("Fulltimer", 15000),
            new Manager("Manager <=10 ", 35000, 5),
            new Manager("Manager > 10", 50000, 11),
            new Hourly("Hourly", 400, 8)
        };

        paymentModule.payment(employees);

        System.out.println("Total Pay: " + paymentModule.getTotalPay());
    }
}
