import java.util.*;

public class Deck {
    List<Card> deckList = new ArrayList<> ();


    public void addCard(Card card) {
        deckList.add (card);
    }


    public void printDeck() {
        int index = 1;
        for (Card card : this.deckList) {
            System.out.print (index + ". ");
            card.show ();
            index++;
        }
    }


    public void shuffleDeck() {
        Collections.shuffle (deckList);
    }


    public Deck drawFive() {
        Deck playerDeck = new Deck ();
        for (int i = 0; i < 5; i++) {
            Card cardDrawn = deckList.get (0);
            playerDeck.addCard (cardDrawn);
            deckList.remove (0);

        }
        return playerDeck;
    }

    public Card draw(int index) {
        Card drawn = this.deckList.get (index - 1);
        Card card = new Deck ().new Card (drawn.rank, drawn.color);
        deckList.remove (drawn);
        return card;
    }

    public static int compare(Card card1, Card card2) {
        int strongerCard = 0;

        if (card1.color.equals (card2.color)) {
            if (card1.rankNumber > card2.rankNumber) {
                strongerCard = 1;
            } else if (card2.rankNumber > card1.rankNumber) {
                strongerCard = 2;
            }
        } else if (card1.colorNumber > card2.colorNumber) {
            strongerCard = 1;
        } else if (card2.colorNumber > card1.colorNumber) {
            strongerCard = 2;
        }

        return strongerCard;
    }

    public static int sum(Deck deck) {
        int sum = 0;
        for (Card card : deck.deckList) {
            sum += card.colorNumber * card.rankNumber;
        }
        return sum;
    }

    public static int playerPlaysNext(int strongerCard) {
        if (strongerCard == 1) {
            return 1;
        } else {
            return 2;
        }
    }


    public class Card {
        public String rank;
        public int rankNumber;
        public String color;
        public int colorNumber;

        public Card() {

        }

        public Card(String r, String c) {
            this.color = c;
            this.rank = r;

            this.rankNumber = 0;
            this.colorNumber = 0;

            if (c.equals ("clubs")) {
                this.colorNumber = 1;
            } else if (c.equals ("diamonds")) {
                this.colorNumber = 2;
            } else if (c.equals ("hearts")) {
                this.colorNumber = 3;
            } else if (c.equals ("spades")) {
                this.colorNumber = 4;
            }

            if (r.equals ("ace")) {
                this.rankNumber = 11;

            } else if (r.equals ("king")) {
                this.rankNumber = 10;
            } else if (r.equals ("queen")) {
                this.rankNumber = 9;
            } else if ((r.equals ("jack"))) {
                this.rankNumber = 8;
            }
        }

        public static Card computerPlays(Deck computerDeck, int i) {
            Random random = new Random ();
            System.out.println ("Player 1/computer/ plays:");
            int card = random.nextInt (1, 6 - i);
            Deck.Card computerCard = computerDeck.draw (card);
            computerCard.show ();
            return computerCard;
        }

        public static Card player2plays(Deck playerDeck) {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Play a card from your deck:");
            playerDeck.printDeck ();
            Deck.Card playerCard = playerDeck.draw (Integer.parseInt (scanner.nextLine ()));
            return playerCard;
        }

        public void show() {
            System.out.println (this.rank + " of " + this.color);
        }
    }
}
