package lab2;

public class ClubTest {
    public static void main(String[] args) {

        SportsClub sports = new SportsClub("Football", 10);

        System.out.println("SportsClub name: " + sports.getName());
        System.out.println("SportsClub budget: "+ sports.determineBudget());

        sports.addMember(5);
        System.out.println("Add 5 members");
        System.out.println("Update sportsClub budget: "+ sports.determineBudget());

        System.out.println("Try to change SportsClub name:");
        sports.changeName("Basketball");
        System.out.println(sports.getName());
        System.out.println();

        MarketingClub marketing = new MarketingClub("Marketing", 10, 2000);

        System.out.println("MarketingClub name: "+ marketing.getName());
        System.out.println("MarketingClub budget: "+ marketing.determineBudget());

        System.out.println("Use 2000 from budget: "+ marketing.useBudget(2000));
        System.out.println("Use 500 from budget: "+ marketing.useBudget(500));
    }
}
