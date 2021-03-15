package cs3500.pyramidsolitaire.model.hw02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * represents a model for the pyramid solitaire game.
 */
public class BasicPyramidSolitaire implements PyramidSolitaireModel<Card> {

  protected int numRows;
  protected int numDraw;
  protected List<Card> drawCards;
  protected ArrayList<ArrayList<Card>> pyramid;

  /**
   * Zero argument Constructor that initializes the data.
   */
  public BasicPyramidSolitaire() {
    this.numRows = 0;
    this.numDraw = 0;
    this.drawCards = new ArrayList<Card>();
    this.pyramid = new ArrayList<ArrayList<Card>>();
  }


  /**
   * Return a valid and complete deck of cards.
   *
   * @return the deck of cards as a list
   */
  public List<Card> getDeck() {
    List<Card> cards = new ArrayList<>();
    for (Card.Rank r : Card.Rank.values()) {
      for (Card.Suit s : Card.Suit.values()) {
        cards.add(new Card(r, s));
      }
    }
    return cards;
  }

  /**
   * starts the game.
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
  public void startGame(List<Card> deck, boolean shuffle, int numRows, int numDraw)
      throws IllegalArgumentException {

    //Check deck is not null
    if (deck == null) {
      throw new IllegalArgumentException("Deck can't be null");
    }
    //Check deck is valid
    HashSet<Card> unique = new HashSet<Card>(deck);
    if (unique.size() != 52) {
      throw new IllegalArgumentException("Deck is not valid");
    }
    //Check int parameters to be valid
    if (numDraw < 0 || numRows <= 0) {
      throw new IllegalArgumentException("Num rows and num draw have to be positive");
    }
    //Check for a valid game inputs
    if ((numRows * (numRows + 1)) / 2 + numDraw > 52) {
      throw new IllegalArgumentException("Game can't be initialized with given parameters");
    }
    //Once all checks are done, start filling up the pyramid
    deck = new ArrayList<Card>(deck);
    this.numRows = numRows;
    this.numDraw = numDraw;
    //Check if shuffle is needed to start
    if (shuffle) {
      Collections.shuffle(deck);
    }
    //Deal cards into pyramid
    pyramid = new ArrayList<ArrayList<Card>>();
    for (int i = 0; i < numRows; i++) {
      ArrayList<Card> row = new ArrayList<Card>();
      pyramid.add(row);
      for (int j = 0; j <= i; j++) {

        Card c = deck.remove(0);
        row.add(c);

      }
      //Add remaining cards into draw deck
      drawCards = new ArrayList<Card>(deck);
    }
  }

  /**
   * Remove two exposed cards on the pyramid, using the two specified card positions.
   *
   * @param row1  row of first card position, numbered from 0 from the top of the pyramid
   * @param card1 card of first card position, numbered from 0 from left
   * @param row2  row of second card position
   * @param card2 card of second card position
   * @throws IllegalArgumentException if the attempted remove is invalid
   * @throws IllegalStateException    if the game has not yet been started
   */
  public void remove(int row1, int card1, int row2, int card2)
      throws IllegalArgumentException, IllegalStateException {
    //Check state of game
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    //Check for valid removal
    boolean valid = false;
    if (row1 >= 0 && row1 < numRows && card1 >= 0 && card1 < pyramid.get(row1).size()
        && row2 >= 0 && row2 < numRows && card2 >= 0 && card2 < pyramid.get(row2).size()) {
      //Check front cards to be removed
      //Check card 1 valid
      if (((row1 == numRows - 1) || (pyramid.get(row1 + 1).get(card1) == null
          && pyramid.get(row1 + 1).get(card1 + 1) == null)) &&
          ((row2 == numRows - 1) || (pyramid.get(row2 + 1).get(card2) == null
              && pyramid.get(row2 + 1).get(card2 + 1) == null))) {
        valid = true;
      }
    }
    if (valid && pyramid.get(row1).get(card1) != null &&
        pyramid.get(row2).get(card2) != null &&
        pyramid.get(row1).get(card1).getRank().value() +
            pyramid.get(row2).get(card2).getRank().value() == 13) {
      pyramid.get(row1).set(card1, null);
      pyramid.get(row2).set(card2, null);
    } else {
      throw new IllegalArgumentException("Removal for requested cards is not possible");
    }
  }

  /**
   * Remove a single card on the pyramid, using the specified card position.
   *
   * @param row  row of the desired card position, numbered from 0 from the top of the pyramid
   * @param card card of the desired card position, numbered from 0 from left
   * @throws IllegalArgumentException if the attempted remove is invalid
   * @throws IllegalStateException    if the game has not yet been started
   */
  public void remove(int row, int card) throws IllegalArgumentException, IllegalStateException {
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    //Check for valid removal
    boolean valid = false;
    if (row >= 0 && row < numRows && card >= 0 && card < pyramid.get(row).size()) {
      //Check front cards to be removed
      //Check card 1 valid
      if (((row == numRows - 1) || (pyramid.get(row + 1).get(card) == null
          && pyramid.get(row + 1).get(card + 1) == null))) {
        valid = true;
      }
    }
    if (valid && pyramid.get(row).get(card) != null &&
        pyramid.get(row).get(card).getRank().value() == 13) {
      pyramid.get(row).set(card, null);
    } else {
      throw new IllegalArgumentException("Removal for requested card is not possible");
    }
  }

  /**
   * Remove two cards, one from the draw pile and one from the pyramid.
   *
   * @param drawIndex the card from the draw pile, numbered from 0 from left
   * @param row       row of the desired card position, numbered from 0 from the top of the pyramid
   * @param card      card of the desired card position, numbered from 0 from left
   * @throws IllegalArgumentException if the attempted remove is invalid
   * @throws IllegalStateException    if the game has not yet been started
   */
  public void removeUsingDraw(int drawIndex, int row, int card)
      throws IllegalArgumentException, IllegalStateException {
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    //Check for valid removal
    boolean valid = false;
    if (row >= 0 && row < numRows && card >= 0 && card < pyramid.get(row).size()) {
      //Check front cards to be removed
      //Check card 1 valid
      if (((row == numRows - 1) || (pyramid.get(row + 1).get(card) == null
          && pyramid.get(row + 1).get(card + 1) == null))) {
        valid = true;
      }
    }
    if (valid && pyramid.get(row).get(card) != null && drawIndex >= 0
        && drawIndex < numDraw && drawIndex < drawCards.size()
        && drawCards.get(drawIndex).getRank().value() +
        pyramid.get(row).get(card).getRank().value() == 13) {
      pyramid.get(row).set(card, null);
      drawCards.remove(drawIndex);
    } else {
      throw new IllegalArgumentException("Removal for requested card is not possible");
    }

  }

  /**
   * Discards an individual card from the draw pile.
   *
   * @param drawIndex the card from the draw pile to be discarded
   * @throws IllegalArgumentException if the index is invalid or no card is present there
   * @throws IllegalStateException    if the game has not yet been started
   */
  public void discardDraw(int drawIndex) throws IllegalArgumentException, IllegalStateException {
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    //Check for valid removal
    if (drawIndex >= 0 && drawIndex < numDraw && drawIndex < drawCards.size()) {
      drawCards.remove(drawIndex);
    } else {
      throw new IllegalArgumentException("Removal for requested card is not possible");
    }
  }

  /**
   * Returns the number of rows originally in the pyramid, or -1 if the game hasn't been started.
   *
   * @return the height of the pyramid, or -1
   */
  public int getNumRows() {
    if (pyramid.size() == 0) {
      return -1;
    }
    return numRows;
  }

  /**
   * Returns the maximum number of visible cards in the draw pile, or -1 if the game hasn't been
   * started.
   *
   * @return the number of visible cards in the draw pile, or -1
   */
  public int getNumDraw() {
    if (pyramid.size() == 0) {
      return -1;
    }
    return numDraw;
  }

  /**
   * Returns the width of the requested row, measured from the leftmost card to the rightmost card
   * (inclusive) as the game is initially dealt.
   *
   * @param row the desired row (0-indexed)
   * @return the number of spaces needed to deal out that row
   * @throws IllegalArgumentException if the row is invalid
   * @throws IllegalStateException    if the game has not yet been started
   */
  public int getRowWidth(int row) {
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    if (row >= 0 && row < numRows) {
      return pyramid.get(row).size();
    } else {
      throw new IllegalArgumentException("Invalid row requested");
    }
  }

  /**
   * Signal if the game is over or not. A game is said to be over if there are no possible removes
   * or discards.
   *
   * @return true if game is over, false otherwise
   * @throws IllegalStateException if the game hasn't been started yet
   */
  public boolean isGameOver() throws IllegalStateException {
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    if (getScore() == 0) {
      //Player won!
      return true;
    }
    if (numDraw < drawCards.size()) {
      return false;
    }
    List<Card> availableCards = getAvailableCards();
    for (int i = 0; i < availableCards.size(); i++) {
      for (int j = i + 1; j < availableCards.size(); j++) {
        if (availableCards.get(i).getRank().value() +
            availableCards.get(j).getRank().value() == 13) {
          return false;
        } else if (availableCards.get(i).getRank().value() == 13) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * gets the list of available cards in the pyramid.
   *
   * @return the list of available cards in the pyramid
   */
  protected List<Card> getAvailableCards() {
    List<Card> cards = new ArrayList<Card>(drawCards);
    for (int i = 0; i < numRows; i++) {
      for (int j = numRows - 1; j >= 0 && j >= i; j--) {
        if (pyramid.get(j).get(i) != null && ((j == numRows - 1) ||
            (pyramid.get(j + 1).get(i) == null
                && pyramid.get(j + 1).get(i + 1) == null))) {
          cards.add(pyramid.get(j).get(i));
          break;
        }
      }
    }
    return cards;
  }

  /**
   * Return the current score, which is the sum of the values of the cards remaining in the
   * pyramid.
   *
   * @return the score
   * @throws IllegalStateException if the game hasn't been started yet
   */
  public int getScore() throws IllegalStateException {
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    int score = 0;
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j <= i; j++) {
        if (pyramid.get(i).get(j) != null) {
          score += pyramid.get(i).get(j).getRank().value();
        }
      }
    }
    return score;
  }

  /**
   * Returns the card at the specified coordinates.
   *
   * @param row  row of the desired card (0-indexed from the top)
   * @param card column of the desired card (0-indexed from the left)
   * @return the card at the given position, or <code>null</code> if no card is there
   * @throws IllegalArgumentException if the coordinates are invalid
   * @throws IllegalStateException    if the game hasn't been started yet
   */
  public Card getCardAt(int row, int card) throws IllegalStateException {
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    if (row >= 0 && row < numRows && card >= 0 && card < pyramid.get(row).size()) {
      return pyramid.get(row).get(card);
    } else {
      throw new IllegalArgumentException("Invalid card requested " + row + " " + card);
    }
  }

  /**
   * Returns the currently available draw cards. There should be at most {@link
   * PyramidSolitaireModel#getNumDraw} cards (the number specified when the game started) -- there
   * may be fewer, if cards have been removed.
   *
   * @return the ordered list of available draw cards
   * @throws IllegalStateException if the game hasn't been started yet
   */
  public List<Card> getDrawCards() throws IllegalStateException {
    ArrayList<Card> visible = new ArrayList<Card>();
    for (int i = 0; i < numDraw && i < drawCards.size(); i++) {
      visible.add(drawCards.get(i));
    }
    return visible;
  }

}