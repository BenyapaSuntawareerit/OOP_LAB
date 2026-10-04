package lab3;

public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule paymentModule = new PaymentModule();

        Employee e1 = new Fulltimer("Fulltimer", 15000);
        Employee e2 = new Manager("Manager <= 10", 35000, 5);
        Employee e3 = new Manager("Manager > 10", 50000, 11);
        Employee e4 = new Hourly("Hourly", 400, 8);

        paymentModule.payment(e1);
        paymentModule.payment(e2);
        paymentModule.payment(e3);
        paymentModule.payment(e4);

        System.out.println("Total Pay: " + paymentModule.getTotalPay());
    }
}