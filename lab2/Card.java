package lab2;

public class Card {
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    public enum Suite {
        DIAMONDS, CLUBS, HEARTS, SPADES
    }

    private Rank rank;
    private Suite suit;

    public Card(Rank rank, Suite suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suite getSuit() {
        return suit;
    }
}
