

package card_game;

/**
 *This class +++Insert Description Here+++
 *
 * @author Dhruv Shukla 
 * @author Parth Contractor
 * @Yash Patel
 */
import java.util.ArrayList;


public class Player {
    private String Name;
    private int pt;

    private ArrayList<Card> st = new ArrayList<>();

    public Player(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public int getPoint() {
        return pt;
    }

    public void setPoint(int point) {
        this.pt += point;
    }

    public ArrayList<Card> getStack() {
        return st;
    }

    public void giveCard(Card card) {
        st.add(card);
    }
}