public class Card {
    private String value;
    private String suit;

    Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return value +"-"+ suit;
    }
}