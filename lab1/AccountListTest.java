package lab1;

public class AccountListTest {
    public static void main(String[] args) {
        AccountList al = new AccountList(3);

        // success should be true
        boolean success = al.appendAccount(new Account("Oak", 1.0));
            System.out.println("Add Oak: " + success);
        success = al.appendAccount(new Account("Two", 0.1));
            System.out.println("Add Two: " + success);
                    
        // It should print:
        // "Input index exceeds the number of appended elements"
        Account account = al.getAccount(2);
            System.out.println(account); // should print null

        account = al.getAccount(1);
        // Or whatever getter is specified. It should print 0.1.
            System.out.println(account.getBalance());

        success = al.appendAccount(new Account("tmp", 0));
            System.out.println(success);
        success = al.appendAccount(new Account("tmp2", 0));
            System.out.println(success); // it should print false
    }
}
