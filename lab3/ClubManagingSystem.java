package lab3;

import lab2.Club;

public class ClubManagingSystem {

    private final Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int total = 0;
        for (Club c : clubList) {
            total += c.determineBudget();
        }
        return total;
    }

    public int getAllMembers() {
        int total = 0;
        for (Club c : clubList) {
            total += c.getNumMember();
        }
        return total;
    }

    public Club getHighestMemberClub() {
        Club highest = clubList[0];
        for (Club c : clubList) {
            if (c.getNumMember() > highest.getNumMember()) {
                highest = c;
            }
        }
        return highest;
    }
}