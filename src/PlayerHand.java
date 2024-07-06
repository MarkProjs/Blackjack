import java.util.ArrayList;

public class PlayerHand extends Hand {
    PlayerHand(ArrayList<Card> hand) {
        super(hand);
    }

    public void hit(Card card) {
        hand.add(card);
    }

    public int stay() {
        return handValue();
    }

    public String toString() {
      String playerCard = "";
      for (int i = 0; i < hand.size(); i++) {
        if (i == hand.size() - 1) {
          playerCard += hand.get(i).toString();
        } else  {
          playerCard += hand.get(i).toString() + " " + "+ ";
        }
      }
      return playerCard;
    }

}
