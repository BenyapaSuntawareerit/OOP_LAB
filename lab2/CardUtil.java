package lab2;

public class CardUtil {
    public static final Card.Rank HIGHEST_RANK = Card.Rank.ACE;
    public static final Card.Suite HIGHEST_SUITE = Card.Suite.SPADES;

    public static boolean isHighestCard(Card card) {
        if (card.getRank() == HIGHEST_RANK && card.getSuit() == HIGHEST_SUITE) {
            return true;
        }
        return false;
    }
}
