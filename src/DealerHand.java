import java.util.ArrayList;

public class DealerHand extends Hand {
    DealerHand(ArrayList<Card> hand) {
        super(hand);
    }

    public String toString() {
      String dealerCard = "";
      if(hand.size() < 3) {
        dealerCard = hand.get(0).toString() + " " + "+ " + "[FACE DOWN]";
      } else {
        for (int i = 0; i < hand.size(); i++) {
          if (i == hand.size() - 1) {
            dealerCard += hand.get(i).toString();
          } else {
            dealerCard += hand.get(i).toString() + " " + "+ ";
          }
        }
      }
      return dealerCard;
    }
}
