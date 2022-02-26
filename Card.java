public class Card {
    // Initializes suit and rank variables:
    private int suit;
    private int rank;

    // Constants that make sure that there isn't any invalid suit or rank;
    private final int MAX_SUIT_NUMBER = 4;
    private final int MAX_RANK_NUMBER = 12;

    // Variables for all cases for the suits:
    private static final int SPADES = 1;
    private static final int HEARTS = 2;
    private static final int DIAMONDS = 3;
    private static final int CLUBS = 4;

    // Variables for specific cases for the ranks:
    private static final int ACE = 1;
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;

    /** Constructor for the Card class: */
    public Card(int theSuit, int theRank) {
        suit = theSuit;
        rank = theRank;
    }

    /** Returns the suit of a certain card: */
    public int getSuit() {
        return this.suit;
    }

    /** Modifies the suit of a certain card: */
    public void setSuit(int newSuit) {
        if (suit <= MAX_SUIT_NUMBER && suit > 0) {
            this.suit = newSuit;
        }
    }

    /** Converts the suit of a card into a string: */
    public String setSuitAsString() {
        String suitsString = "";
        if (suit == SPADES) {
            suitsString += "Spades";
        } else if (suit == HEARTS) {
            suitsString += "Hearts";
        } else if (suit == DIAMONDS) {
            suitsString += "Diamonds";
        } else if (suit == CLUBS) {
            suitsString += "Clubs";
        }
        return suitsString;
    }

    /** Returns the rank of a certain card: */
    public int getRank() {
        return this.rank;
    }

    /** Modifies the rank of a certain card */
    public void setRank(int newRank) {
        if (rank <= MAX_RANK_NUMBER && rank > 0) {
            this.rank = newRank;
        }
    }

    /** Converts the rank of a card into a string: */
    public String setRankAsString() {
        String ranksString = "";
        if (rank == ACE) {
            ranksString += "Ace";
        } else if (rank == JACK) {
            ranksString += "Jack";
        } else if (rank == QUEEN) {
            ranksString += "Queen";
        } else if (rank == KING) {
            ranksString += "King";
        } else if (rank > 1 && rank <= 10) {
            ranksString += rank + "";
        }
        return ranksString;
    }   
   
    public String toString() {
        String cardsString = "";
        if (setSuitAsString() != null && setRankAsString() != null) {
            cardsString += setRankAsString() + " of " + setSuitAsString();
        }
        return cardsString;
    }
}
