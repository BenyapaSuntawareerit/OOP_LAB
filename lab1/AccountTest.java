package lab1;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Benyapa", 10000);
            System.out.println("Account Name: "+account.getName());
            System.out.println("Account Balance: "+account.getBalance());
            System.out.println();

        account.setName("Benjama");
            System.out.println("Update account name: "+account.getName());
            System.out.println();

        account.deposit(500);
            System.out.println("Deposit 500");
            System.out.println("Account Balance: "+account.getBalance());
            System.out.println();
        account.deposit(-100);
            System.out.println("Deposit -100");
            System.out.println("Account Balance: "+account.getBalance());
    }
}
