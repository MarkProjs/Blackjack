public class Card {
    private String value;
    private String suit;

    Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        if (this.value.equals("A")) {
            return 11;
        } else if (this.value.equals("J") || this.value.equals("Q") || this.value.equals("K")) {
            return 10;
        } else {
            return Integer.parseInt(this.value);
        }
    }

    public String toString() {
        return value +"-"+ suit;
    }
}
