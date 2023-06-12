import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Deck mainDeck = new Deck ();

        Deck.Card card1 = new Deck ().new Card ("jack", "clubs");
        Deck.Card card2 = new Deck ().new Card ("queen", "clubs");
        Deck.Card card3 = new Deck ().new Card ("king", "clubs");
        Deck.Card card4 = new Deck ().new Card ("ace", "clubs");
        Deck.Card card5 = new Deck ().new Card ("jack", "diamonds");
        Deck.Card card6 = new Deck ().new Card ("queen", "diamonds");
        Deck.Card card7 = new Deck ().new Card ("king", "diamonds");
        Deck.Card card8 = new Deck ().new Card ("ace", "diamonds");
        Deck.Card card9 = new Deck ().new Card ("jack", "hearts");
        Deck.Card card10 = new Deck ().new Card ("queen", "hearts");
        Deck.Card card11 = new Deck ().new Card ("king", "hearts");
        Deck.Card card12 = new Deck ().new Card ("ace", "hearts");
        Deck.Card card13 = new Deck ().new Card ("jack", "spades");
        Deck.Card card14 = new Deck ().new Card ("queen", "spades");
        Deck.Card card15 = new Deck ().new Card ("king", "spades");
        Deck.Card card16 = new Deck ().new Card ("ace", "spades");

        mainDeck.addCard (card1);
        mainDeck.addCard (card2);
        mainDeck.addCard (card3);
        mainDeck.addCard (card4);
        mainDeck.addCard (card5);
        mainDeck.addCard (card6);
        mainDeck.addCard (card7);
        mainDeck.addCard (card8);
        mainDeck.addCard (card9);
        mainDeck.addCard (card10);
        mainDeck.addCard (card11);
        mainDeck.addCard (card12);
        mainDeck.addCard (card13);
        mainDeck.addCard (card14);
        mainDeck.addCard (card15);
        mainDeck.addCard (card16);

        mainDeck.shuffleDeck ();
        System.out.println ("-----main deck.");


        Deck computerDeck = mainDeck.drawFive ();
        Deck computerWon = new Deck ();
        System.out.println ("-----computer deck.");


        Deck playerDeck = mainDeck.drawFive ();
        Deck playerWon = new Deck ();
        System.out.println ("-----player deck.");


        Random random = new Random ();
        int playerPlaysNext = 1;
        for (int i = 0; i < 5; i++) {

            int strongerCard = 0;

            if (playerPlaysNext == 1) {
                Deck.Card computerCard = Deck.Card.computerPlays (computerDeck, i);
                Deck.Card playerCard = Deck.Card.player2plays (playerDeck);

                strongerCard = Deck.compare (computerCard, playerCard);

                if (strongerCard == 1) {
                    System.out.println ("Player one wins this hand.");
                    computerWon.addCard (computerCard);
                    computerWon.addCard (playerCard);

                } else {
                    System.out.println ("You win this hand.");
                    playerWon.addCard (computerCard);
                    playerWon.addCard (playerCard);

                }


            } else {
                Deck.Card playerCard = Deck.Card.player2plays (playerDeck);
                Deck.Card computerCard = Deck.Card.computerPlays (computerDeck, i);

                strongerCard = Deck.compare (computerCard, playerCard);

                if (strongerCard == 1) {
                    System.out.println ("Player one wins this hand.");
                    computerWon.addCard (computerCard);
                    computerWon.addCard (playerCard);

                } else {
                    System.out.println ("You win this hand.");
                    playerWon.addCard (computerCard);
                    playerWon.addCard (playerCard);

                }
            }
            playerPlaysNext = Deck.playerPlaysNext (strongerCard);
        }

        int computerPoints = Deck.sum (computerWon);
        int playerPoints = Deck.sum (playerWon);
        if (computerPoints == playerPoints) {
            System.out.println ("Even score. Nobody won!");
        } else if (computerPoints > playerPoints) {
            System.out.println ("Player 1/computer/ won!");
        } else {
            System.out.println ("You won!");
        }
    }
}
