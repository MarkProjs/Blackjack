import java.util.ArrayList;

public class Hand {
    protected ArrayList<Card> hand = new ArrayList<Card>(15);

    Hand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }
    public int length() {
        return hand.size();
    }
    public Card getCard(int index) {
        if (index > hand.size()) {
            throw new IndexOutOfBoundsException();
        }
        return hand.get(index);
    }
    public int handValue() {
        int total = 0;
        for (Card card : hand) {
          total += card.getValue();
        }
  
        return total;
    }
}
