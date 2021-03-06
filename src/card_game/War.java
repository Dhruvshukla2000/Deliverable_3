

package card_game;

/**
 *This class +++Insert Description Here+++
 *
 * @author Dhruv Shukla
 * @author Parth Contractor
 * @Yash Patel
 */
import java.util.ArrayList;
import java.util.Collections;


public class War {
    public static void main(String[] args) {
        Player player1 = new Player("John");
        Player player2 = new Player("Freed");

        ArrayList<Card> deck = new ArrayList<>();

        // Deck builder
        for (int i = 0; i < Card.colors.length; i++) {
            for (int j = 0; j < Card.values.length; j++) {
                Card card = new Card(Card.values[j], Card.colors[i]);

                deck.add(card);
            }
        }

        // Mix cards
        Collections.shuffle(deck);

        // Divide the deck evenly among the two players
        for (int i = 0; i < deck.size(); i = i + 2) {
            player1.giveCard(deck.get(i));
            player2.giveCard(deck.get(i + 1));
        }

        int gain = 1;
        for (int i = player1.getStack().size(); i > 0; i--) {
            if (player1.getStack().get(i - 1).isGreaterThan(player2.getStack().get(i - 1))) {
                player1.setPoint(gain );
                gain = 1;
            } else if (player2.getStack().get(i - 1).isGreaterThan(player1.getStack().get(i - 1))) {
                player2.setPoint(gain);
                gain = 1;
            } else
                // War!
                gain++;
        }

        // Determine who the winner is
        if (player1.getPoint() > player2.getPoint()) {
            System.out.println(player1.getName() + " wins");
        } else if (player2.getPoint() > player1.getPoint()) {
            System.out.println(player2.getName() + " wins");
        } else {
            System.out.println("Draw");
        }
    }
}