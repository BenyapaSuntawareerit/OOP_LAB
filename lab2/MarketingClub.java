package lab2;

public class MarketingClub extends Club {

    private int budget;

    public MarketingClub(String c, int m, int b) {
        super(c, m);
        budget = b;
    }

    public boolean useBudget(int amount) {
        if (budget - amount < 0) {
            return false;
        }

        budget = budget - amount;
        return true;
    }

    @Override
    public int determineBudget() {
        if (budget > 1000) {
            return 0;
        }
        return super.determineBudget();
    }
}
