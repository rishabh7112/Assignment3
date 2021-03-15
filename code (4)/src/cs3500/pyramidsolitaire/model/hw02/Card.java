package cs3500.pyramidsolitaire.model.hw02;

import java.util.Objects;

/**
 * represents the cards that will be used in the solitaire game.
 */

public class Card {

  private final Rank value;
  private final Suit suit;

  /**
   * enumeration of the rank of cards.
   */
  public enum Rank {
    A(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    J(11),
    Q(12),
    K(13);

    private int value;

    /**
     * Rank Constructor.
     *
     * @param value represents the value of card
     */
    Rank(int value) {
      this.value = value;
    }

    /**
     * gets the value of rank.
     *
     * @return the value of rank.
     */
    public int value() {
      return value;
    }
  }

  /**
   * enumeration of the suit of cards.
   */
  public enum Suit {
    SPADES('♠'), CLUBS('♣'), DIAMONDS('♦'), HEARTS('♥');

    private char c;

    /**
     * Constructor for Suit.
     *
     * @param c represents the suit
     */
    Suit(char c) {
      this.c = c;
    }

    /**
     * returns the suit symbol of the corresponding card.
     *
     * @return the suit symbol.
     */
    public char suit() {
      return c;
    }
  }

  /**
   * 2 Argument constructor of Card.
   *
   * @param value represents the value of the rank
   * @param suit  represents the suit of the card
   */
  public Card(Rank value, Suit suit) {
    this.value = value;
    this.suit = suit;
  }

  /**
   * the way the cards will be printed.
   *
   * @return the string version of the card
   */
  public String toString() {
    if (value == Rank.A || value == Rank.J || value == Rank.Q || value == Rank.K) {
      return value + "" + suit.suit();
    }
    return value.value + "" + suit.suit();
  }

  /**
   * gets the value of the rank.
   *
   * @return the value of rank
   */
  public Rank getRank() {
    return value;
  }

  /**
   * gets the suit of the card.
   *
   * @return the suit of the card
   */
  public Suit getSuit() {
    return suit;
  }

  /**
   * overrides the equals method to compare cards.
   *
   * @param o object
   * @return true if the cards are the same
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return value == card.value &&
        suit == card.suit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, suit);
  }

}

