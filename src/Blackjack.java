import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Blackjack {
    ArrayList<Card> deck = new ArrayList<Card>(53);
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    // Constructor
    Blackjack() {
        startGame();
    }
    public void startGame() {
        System.out.println("Welcome to Blackjack!");
        buildDeck();
        System.out.println("Let's shuffle the deck!");
        shuffleDeck();
        System.out.println("Let's start the game!");
        ArrayList<Card> playerCards = new ArrayList<Card>();
        ArrayList<Card> dealerCards = new ArrayList<Card>();
        playerCards.add(deck.get(0));
        playerCards.add(deck.get(1));
        dealerCards.add(deck.get(2));
        dealerCards.add(deck.get(3));
        PlayerHand playerHand = new PlayerHand(playerCards);
        DealerHand dealerHand = new DealerHand(dealerCards);
        System.out.println("Your cards are: " + playerHand + " which totals to " + playerHand.handValue());
        System.out.println("The dealer's cards are: " + dealerHand);
        System.out.println("Would you like to hit or stay? Enter 1 for hit or 2 for stay.");// TODO: handle exception
        }


    }


    private boolean isInputValid(int input) {
        return input == 1 || input == 2;
    }


    public void buildDeck() {
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"C", "D", "H", "S"};      
        for (String suit : suits) {
            for (String value : values) {
                Card card = new Card(value, suit);
                deck.add(card);
            }
        }
        System.out.println("Deck built successfully!");
    }
    public void shuffleDeck() {
        for (int i = 0; i < deck.size(); i++) {
            int RandIndex = rand.nextInt(deck.size());
            deck.set(i, deck.get(RandIndex));
            deck.set(RandIndex, deck.get(i));
        }
        System.out.println("Deck shuffled successfully!");
    }
}
