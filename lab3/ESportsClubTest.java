package lab3;

import lab2.Club;

public class ESportsClubTest {
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);

        System.out.println("=== ESportsClub e ===");
        System.out.println("Name: " + e.getName());
        System.out.println("Members: " + e.getNumMember());
        System.out.println("Budget: " + e.determineBudget());

        e.advertise();

        System.out.println();

        Club c = new ESportsClub("Esport", 100);

        System.out.println("=== Club c ===");
        System.out.println("Name: " + c.getName());
        System.out.println("Budget: " + c.determineBudget());

        c.advertise();
    }
}