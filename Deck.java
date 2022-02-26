public class Deck {
    // Initializes deck & other constants:
    private Card[] deck;
    private final int MAXIMUM_SIZE = 52;

    /** Generates a deck of 52 cards in order: */
    public Deck() {
        int count = 0;
        deck = new Card[MAXIMUM_SIZE];
        for (int rank = 1; rank <= 13; rank++) {
            for (int suit = 1; suit <= 4; suit++) {
                deck[count] = new Card(suit, rank);
                count++;
            }
        }
    }

    /** Tells us if the deck has any cards or not: */
    public boolean isDeckEmpty() {
        if (deck[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    /** Tells us the number of cards in the deck: */
    public int numCards() {
        for (int i = 0; i < MAXIMUM_SIZE; i++) {
            if (deck[i] == null) {
                return i;
            }
        }
        return MAXIMUM_SIZE;
    }

    /** Deals a card from the deck: */
    public Card deal() {
        if (numCards() == 0) {
            return null;
        }
        Card dealtCard = deck[numCards() - 1];
        deck[numCards() - 1] = null;
        return dealtCard;
    }

  /** not finished yet */
}
