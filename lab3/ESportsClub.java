package lab3;

import lab2.SportsClub;

public final class ESportsClub extends SportsClub {
    public ESportsClub(String c, int m) {
        super(c, 1);
        numMember = m; 
    }

    @Override
    public final void advertise() {
        System.out.println("No need to advertise");
    }
}