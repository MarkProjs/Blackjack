import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Blackjack {
    ArrayList<Card> deck;
    Random rand = new Random();

    // Constructor
    Blackjack() {
        startGame();
    }
    public void startGame() {
        buildDeck();
        shuffleDeck();
    }

    public void buildDeck() {
        deck = new ArrayList<Card>();
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"C", "D", "H", "S"};      
        for (String suit : suits) {
            for (String value : values) {
                Card card = new Card(value, suit);
                deck.add(card);
            }
        }
        System.out.println("Deck built successfully!");
        System.out.println(deck);
    }
    public void shuffleDeck() {
        for (int i = 0; i < deck.size(); i++) {
            int RandIndex = rand.nextInt(deck.size());
            deck.set(i, deck.get(RandIndex));
            deck.set(RandIndex, deck.get(i));
        }
        System.out.println("Deck shuffled successfully!");
        System.out.println(deck);
    }
}
