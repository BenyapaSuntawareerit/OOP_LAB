package lab3;

public class AdvancedPaymentModule extends PaymentModule {

    public void payment(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            super.payment(employees[i]);
        }
    }
}