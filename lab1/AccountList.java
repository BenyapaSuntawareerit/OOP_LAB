package lab1;

public class AccountList {

    private Account[] accounts;
    private int count;

    public AccountList(int size) {
        accounts = new Account[size];
        count = 0;
    }

    public boolean appendAccount(Account account) {
        if (count < accounts.length) {
            accounts[count] = account;
            count++;
            return true;
        }
        return false;
    }

    public Account getAccount(int idx) {
        if (idx < count) {
            return accounts[idx];
        }
        System.out.println("Input index exceeds the number of appended elements");
        return null;
    }
}
