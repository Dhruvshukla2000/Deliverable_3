

package card_game;

/**
 *This class +++Insert Description Here+++
 *
 * @author Dhruv Shukla */
import java.util.ArrayList;


public class Player {
    private String Name;
    private int points;

    private ArrayList<Card> stack = new ArrayList<>();

    public Player(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public ArrayList<Card> getStack() {
        return stack;
    }

    public void giveCard(Card card) {
        stack.add(card);
    }
}