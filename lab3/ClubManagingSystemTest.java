package lab3;

import lab2.Club;
import lab2.MarketingClub;
import lab2.SportsClub;

public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club student = new Club("Student", 10);
        student.addMember(190);

        Club football = new SportsClub("Football", 22);
        football.addMember(18);

        Club rov = new ESportsClub("RoV", 5);

        Club ads = new MarketingClub("Advertising", 2, 100);
        ads.addMember(8);

        Club[] clubs = { student, football, rov, ads };
        ClubManagingSystem system = new ClubManagingSystem(clubs);

        System.out.println("Highest member club: " + system.getHighestMemberClub().getName());
        System.out.println("Total budget: " + system.determineAllBudget());
        System.out.println("Total members: " + system.getAllMembers());
    }
}