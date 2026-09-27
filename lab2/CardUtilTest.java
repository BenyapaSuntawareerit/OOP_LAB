package lab2;

public class CardUtilTest {
    public static void main(String[] args) {

        Card card1 = new Card(Card.Rank.ACE, Card.Suite.SPADES);
        Card card2 = new Card(Card.Rank.ACE, Card.Suite.DIAMONDS);
        Card card3 = new Card(Card.Rank.KING, Card.Suite.HEARTS);

        System.out.println("Ace/Spades: "+CardUtil.isHighestCard(card1));
        System.out.println("Ace/Diamonds: "+CardUtil.isHighestCard(card2));
        System.out.println("King/Hearts: "+CardUtil.isHighestCard(card3));
    }
}
