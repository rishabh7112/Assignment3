package cs3500.pyramidsolitaire.model.hw04;

import cs3500.pyramidsolitaire.model.hw02.BasicPyramidSolitaire;
import cs3500.pyramidsolitaire.model.hw02.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * represents the multi pyramid model where there are 3 pyramids with 104 cards.
 */
public class MultiPyramidSolitaireModel extends BasicPyramidSolitaire {

  public MultiPyramidSolitaireModel() {
    super();
  }

  /**
   * Return a valid and complete(104) deck of cards.
   *
   * @return the deck of cards as a list
   */
  @Override
  public List<Card> getDeck() {
    List<Card> cards = new ArrayList<>();
    cards.addAll(super.getDeck());
    cards.addAll(super.getDeck());
    return cards;
  }

  /**
   * starts the game for the multipyramid in which it draws out 3 pyramids conjoined with the 104
   * card deck.
   *
   * @param deck    the deck to be dealt
   * @param shuffle if {@code false}, use the order as given by {@code deck}, otherwise use a
   *                randomly shuffled order
   * @param numRows number of rows in the pyramid
   * @param numDraw number of draw cards available at a time
   * @throws IllegalArgumentException if the deck is null or invalid, the number of pyramid rows is
   *                                  non-positive,  the number of draw cards available at a time is
   *                                  negative, or a full pyramid and draw pile cannot be dealt with
   *                                  the number of given cards in deck
   */
  @Override
  public void startGame(List<Card> deck, boolean shuffle, int numRows, int numDraw)
      throws IllegalArgumentException {
    //Check deck is not null
    if (deck == null) {
      throw new IllegalArgumentException("Deck can't be null");
    }
    //Check deck is valid
    if (deck.size() != 104 || !validDeck(deck)) {
      throw new IllegalArgumentException("Deck is not valid");
    }
    //Check int parameters to be valid
    if (numDraw < 0 || numRows <= 0) {
      throw new IllegalArgumentException("Num rows and num draw have to be positive");
    }
    //Check for a valid game inputs
    int numOverlap = (int) Math.ceil((numRows * 1.0) / 2);
    int total = (numRows * (numRows + 1)) / 2;
    total += (total - (numOverlap * (numOverlap + 1)) / 2) * 2;
    if (total + numDraw > 104) {
      throw new IllegalArgumentException("Game can't be initialized with given parameters");
    }
    //Once all checks are done, start filling up the pyramid
    deck = new ArrayList<Card>(deck);
    this.numRows = numRows;
    this.numDraw = numDraw;
    //Check if shuffle is needed to start
    if (shuffle) {
      Random r = new Random();
      for (int n = 1; n < 1000; n++) {
        int i = r.nextInt(deck.size());
        int j = r.nextInt(deck.size());
        //Swap values on indices
        Card temp = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, temp);
      }
    }
    //Deal cards into pyramid
    //Make initial number of spots needed
    pyramid = new ArrayList<ArrayList<Card>>();
    int num = (numRows - numOverlap) * 2 + 1;
    int step = numRows - numOverlap;
    for (int i = 0; i < numRows; i++) {
      ArrayList<Card> row = new ArrayList<Card>();
      if (i >= numRows - numOverlap - 1) {
        for (int j = 1; j <= num; j++) {
          Card c = deck.remove(0);
          row.add(c);
        }
      } else {
        for (int j = 0; j < num; j++) {
          row.add(null);
        }
        int start = 0;
        while (start < num) {
          for (int j = start; j <= start + i; j++) {
            Card c = deck.remove(0);
            row.set(j, c);
          }
          start += step;
        }
      }
      pyramid.add(row);
      num++;
    }
    //Add remaining cards into draw deck
    drawCards = new ArrayList<Card>(deck);
  }


  /**
   * checks if the deck is valid by seeing if there are only duplicates of each card in a deck.
   *
   * @param deck the deck to be dealt
   * @return true if the deck is valid and only has duplicate cards
   */
  private boolean validDeck(List<Card> deck) {
    boolean valid = true;
    ArrayList<String> cards = new ArrayList<String>();
    for (int i = 0; i < deck.size(); i++) {
      Card card = deck.get(i);
      if (!cards.contains(card.toString())) {
        cards.add(card.toString());
        int num = 1;
        for (int j = i + 1; j < deck.size(); j++) {
          if (deck.get(j).equals(card)) {
            num++;
          }
        }
        if (num != 2) {
          valid = false;
          break;
        }
      }
    }
    return valid;
  }

}