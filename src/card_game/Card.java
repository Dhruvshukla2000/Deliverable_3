

package card_game;

/**
 *This class +++Insert Description Here+++
 *
 * @author Dhruv Shukla */
public class Card {
    private String Color;
    private int Value;
    public static String colors[] = {"Hearts", "Spades", "Clover", "Diamonds"};
    public static int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public Card(int val, String color) {
        this.Color = color;
        this.Value = val;
    }

    public int getValue() {
        return this.Value;
    }

    public boolean isGreaterThan(Card card) {
        return (this.Value > card.getValue());
    }
}