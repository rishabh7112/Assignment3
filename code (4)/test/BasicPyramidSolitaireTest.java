import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import cs3500.pyramidsolitaire.model.hw02.BasicPyramidSolitaire;
import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.Card.Rank;
import cs3500.pyramidsolitaire.model.hw02.Card.Suit;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import cs3500.pyramidsolitaire.view.PyramidSolitaireTextualView;
import cs3500.pyramidsolitaire.view.PyramidSolitaireView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * testing all methods of BasicPyramidSolitaire.
 */
public class BasicPyramidSolitaireTest {

  PyramidSolitaireModel b1 = new BasicPyramidSolitaire();
  Card aSpades = new Card(Rank.A, Suit.SPADES);
  Card aClubs = new Card(Rank.A, Suit.CLUBS);
  Card aDiamonds = new Card(Rank.A, Suit.DIAMONDS);
  Card aHearts = new Card(Rank.A, Suit.HEARTS);
  Card twoSpades = new Card(Rank.TWO, Suit.SPADES);
  Card twoClubs = new Card(Rank.TWO, Suit.CLUBS);
  Card twoDiamonds = new Card(Rank.TWO, Suit.DIAMONDS);
  Card twoHearts = new Card(Rank.TWO, Suit.HEARTS);
  Card threeSpades = new Card(Rank.THREE, Suit.SPADES);
  Card threeClubs = new Card(Rank.THREE, Suit.CLUBS);
  Card threeDiamonds = new Card(Rank.THREE, Suit.DIAMONDS);
  Card threeHearts = new Card(Rank.THREE, Suit.HEARTS);
  Card fourSpades = new Card(Rank.FOUR, Suit.SPADES);
  Card fourClubs = new Card(Rank.FOUR, Suit.CLUBS);
  Card fourDiamonds = new Card(Rank.FOUR, Suit.DIAMONDS);
  Card fourHearts = new Card(Rank.FOUR, Suit.HEARTS);
  Card fiveSpades = new Card(Rank.FIVE, Suit.SPADES);
  Card fiveClubs = new Card(Rank.FIVE, Suit.CLUBS);
  Card fiveDiamonds = new Card(Rank.FIVE, Suit.DIAMONDS);
  Card fiveHearts = new Card(Rank.FIVE, Suit.HEARTS);
  Card sixSpades = new Card(Rank.SIX, Suit.SPADES);
  Card sixClubs = new Card(Rank.SIX, Suit.CLUBS);
  Card sixDiamonds = new Card(Rank.SIX, Suit.DIAMONDS);
  Card sixHearts = new Card(Rank.SIX, Suit.HEARTS);
  Card sevenSpades = new Card(Rank.SEVEN, Suit.SPADES);
  Card sevenClubs = new Card(Rank.SEVEN, Suit.CLUBS);
  Card sevenDiamonds = new Card(Rank.SEVEN, Suit.DIAMONDS);
  Card sevenHearts = new Card(Rank.SEVEN, Suit.HEARTS);
  Card eightSpades = new Card(Rank.EIGHT, Suit.SPADES);
  Card eightClubs = new Card(Rank.EIGHT, Suit.CLUBS);
  Card eightDiamonds = new Card(Rank.EIGHT, Suit.DIAMONDS);
  Card eightHearts = new Card(Rank.EIGHT, Suit.HEARTS);
  Card nineSpades = new Card(Rank.NINE, Suit.SPADES);
  Card nineClubs = new Card(Rank.NINE, Suit.CLUBS);
  Card nineDiamonds = new Card(Rank.NINE, Suit.DIAMONDS);
  Card nineHearts = new Card(Rank.NINE, Suit.HEARTS);
  Card tenSpades = new Card(Rank.TEN, Suit.SPADES);
  Card tenClubs = new Card(Rank.TEN, Suit.CLUBS);
  Card tenDiamonds = new Card(Rank.TEN, Suit.DIAMONDS);
  Card tenHearts = new Card(Rank.TEN, Suit.HEARTS);
  Card jSpades = new Card(Rank.J, Suit.SPADES);
  Card jClubs = new Card(Rank.J, Suit.CLUBS);
  Card jDiamonds = new Card(Rank.J, Suit.DIAMONDS);
  Card jHearts = new Card(Rank.J, Suit.HEARTS);
  Card qSpades = new Card(Rank.Q, Suit.SPADES);
  Card qClubs = new Card(Rank.Q, Suit.CLUBS);
  Card qDiamonds = new Card(Rank.Q, Suit.DIAMONDS);
  Card qHearts = new Card(Rank.Q, Suit.HEARTS);
  Card kSpades = new Card(Rank.K, Suit.SPADES);
  Card kClubs = new Card(Rank.K, Suit.CLUBS);
  Card kDiamonds = new Card(Rank.K, Suit.DIAMONDS);
  Card kHearts = new Card(Rank.K, Suit.HEARTS);

  List fullDeck = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
      twoSpades, twoClubs, twoDiamonds, twoHearts,
      threeSpades, threeClubs, threeDiamonds, threeHearts,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, jDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      kSpades, kClubs, kDiamonds, kHearts));

  List invalidDeck = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
      twoSpades, twoClubs, twoDiamonds, twoHearts,
      threeSpades, threeClubs, threeDiamonds, threeHearts,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, jDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      kSpades, kClubs, kDiamonds, kHearts, aClubs));

  List removeDeck1 = new ArrayList(
      Arrays.asList(tenHearts, sevenDiamonds, sixSpades, aSpades, aClubs, aDiamonds, aHearts,
          twoSpades, twoClubs, twoDiamonds, twoHearts,
          threeSpades, threeClubs, threeDiamonds, threeHearts,
          fourSpades, fourClubs, fourDiamonds, fourHearts, fiveClubs, fiveDiamonds, fiveHearts,
          fiveSpades,
          sixClubs, sixDiamonds, sixHearts,
          sevenSpades, sevenClubs, sevenHearts,
          eightSpades, eightClubs, eightDiamonds, eightHearts,
          nineSpades, nineClubs, nineDiamonds, nineHearts,
          tenSpades, tenClubs, tenDiamonds,
          jSpades, jClubs, jDiamonds, jHearts,
          qSpades, qClubs, qDiamonds, qHearts,
          kSpades, kClubs, kDiamonds, kHearts));

  List removeDeck2 = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
      nineClubs, fourSpades, twoSpades, twoClubs, twoDiamonds, twoHearts,
      threeSpades, threeClubs, threeDiamonds, threeHearts,
      fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, jDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      kSpades, kClubs, kDiamonds, kHearts));

  List removeDeck3 = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
      threeSpades, threeClubs, kSpades, kClubs, kDiamonds, kHearts,
      threeDiamonds, threeHearts,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, jDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      twoSpades, twoClubs, twoDiamonds, twoHearts));

  List removeDeck4 = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
      threeSpades, threeClubs, kSpades, kClubs, aSpades, kHearts,
      threeDiamonds, threeHearts, kDiamonds,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, jDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      twoSpades, twoClubs, twoDiamonds, twoHearts));

  List removeDeck5 = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
      twoSpades, twoClubs, twoDiamonds, twoHearts,
      threeSpades, threeClubs, threeDiamonds, threeHearts,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sevenSpades, sixHearts,
      sixDiamonds, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, jDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      kSpades, kClubs, kDiamonds, kHearts));

  List removeDeck6 = new ArrayList(Arrays.asList(aSpades, kSpades, aDiamonds, aHearts,
      threeSpades, threeClubs, aClubs, kClubs, aSpades, kHearts,
      threeDiamonds, threeHearts, kDiamonds,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, jDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      twoSpades, twoClubs, twoDiamonds, twoHearts));

  List winningDeck = new ArrayList(Arrays.asList(tenHearts, jDiamonds, twoHearts, threeHearts,
      twoSpades, twoClubs, twoDiamonds, aClubs,
      threeSpades, threeClubs, threeDiamonds, aSpades,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, aDiamonds,
      jSpades, jClubs, aHearts, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      kSpades, kClubs, kDiamonds, kHearts));


  //check if it has a full deck
  @Test
  public void getDeck() {
    assertEquals(fullDeck, b1.getDeck());
    assertEquals(fullDeck.size(), b1.getDeck().size());
  }

  //checks if the game starts properly
  @Test
  public void startGame() {
    b1.startGame(fullDeck, true, 7, 2);
    assertEquals(7, b1.getNumRows());
    assertEquals(2, b1.getNumDraw());
    assertEquals(7, b1.getRowWidth(6));
    assertEquals(6, b1.getRowWidth(5));
    assertEquals(5, b1.getRowWidth(4));
    assertEquals(4, b1.getRowWidth(3));
    assertEquals(3, b1.getRowWidth(2));
    assertEquals(2, b1.getRowWidth(1));
    assertEquals(1, b1.getRowWidth(0));

    b1.startGame(fullDeck, false, 4, 4);
    assertEquals(4, b1.getNumRows());
    assertEquals(4, b1.getNumDraw());
    assertEquals(4, b1.getRowWidth(3));
    assertEquals(3, b1.getRowWidth(2));
    assertEquals(2, b1.getRowWidth(1));
    assertEquals(1, b1.getRowWidth(0));
    assertEquals(aSpades, b1.getCardAt(0, 0));
    assertEquals(threeClubs, b1.getCardAt(3, 3));
    try {
      b1.startGame(null, true, 4, 2);
    } catch (Exception e) {
      new IllegalArgumentException("Deck can't be null");
    }
    try {
      b1.startGame(invalidDeck, false, 7, 9);
    } catch (Exception e) {
      new IllegalArgumentException("Deck is not valid");
    }
    try {
      b1.startGame(fullDeck, true, 0, 5);
    } catch (Exception e) {
      new IllegalArgumentException("Num rows and num draw have to be positive");
    }
    try {
      b1.startGame(fullDeck, false, -1, 10);
    } catch (Exception e) {
      new IllegalArgumentException("Num rows and num draw have to be positive");
    }
    try {
      b1.startGame(fullDeck, true, 1, -2);
    } catch (Exception e) {
      new IllegalArgumentException("Num rows and num draw have to be positive");
    }
    try {
      b1.startGame(fullDeck, true, 10, 1);
    } catch (Exception e) {
      new IllegalArgumentException("Game can't be initialized with given parameters");
    }
    try {
      b1.startGame(fullDeck, false, 9, 8);
    } catch (Exception e) {
      new IllegalArgumentException("Game can't be initialized with given parameters");
    }
  }

  //check if the method removes cards in the pyramid under appropriate conditions
  @Test
  public void remove() {
    PyramidSolitaireView m = new PyramidSolitaireTextualView(b1);
    String r1 = "  10♥" + "\n" + ".   ." + "\n" + "Draw: A♠, A♣";
    b1.startGame(removeDeck1, false, 2, 2);
    b1.remove(1, 0, 1, 1);
    assertEquals(r1, m.toString());

    String r2 = "    A♠" + "\n" + "  A♣  A♦" + "\n" + "A♥  .   ." + "\n" + "Draw: 2♠, 2♣, 2♦";
    b1.startGame(removeDeck2, false, 3, 3);
    b1.remove(2, 1, 2, 2);
    assertEquals(r2, m.toString());

    try {
      b1.startGame(fullDeck, false, 7, 6);
      b1.remove(3, 5, 4, 3);
      fail("Doesn't throw Exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Removal for requested cards is not possible", e.getMessage());
    }

    try {
      b1.startGame(removeDeck2, false, 4, 2);
      b1.remove(3, 3, 3, 4);
    } catch (Exception e) {
      new IllegalArgumentException("Removal for requested card is not possible");
    }
    try {
      b1.startGame(removeDeck1, false, 0, 2);
      b1.remove(0, 3, 2, 3);
    } catch (Exception e) {
      new IllegalArgumentException("Removal for requested card is not possible");
    }
  }

  //check if the method removes card that is of value 13 and exposed
  @Test
  public void testRemove() {
    String r3 =
        "      A♠" + "\n" + "    A♣  A♦" + "\n" + "  A♥  3♠  3♣" + "\n" + "K♠  .   K♦  K♥" + "\n"
            + "Draw: 3♦, 3♥";
    b1.startGame(removeDeck3, false, 4, 2);
    b1.remove(3, 1);
    assertEquals(r3, b1.toString());

    String r4 =
        "        A♠" + "\n" + "      A♣  A♦" + "\n" + "    A♥  3♠  3♣" + "\n" + "  K♠  K♣  A♠  K♥"
            + "\n" + "3♦  3♥  .   4♠  4♣" + "\n" + "Draw: 4♦, 4♥, 5♠, 5♣";
    b1.startGame(removeDeck4, false, 5, 4);
    b1.remove(4, 2);
    assertEquals(r4, b1.toString());

    try {
      b1.startGame(fullDeck, false, 7, 2);
      b1.remove(0, 1);
    } catch (Exception e) {
      new IllegalArgumentException("Removal for requested card is not possible");
    }

    try {
      b1.startGame(removeDeck1, false, 0, 2);
      b1.remove(0, 0);
    } catch (Exception e) {
      new IllegalStateException("Game has not started yet");
    }

  }

  //checks if the method removes cards from the draw pile and pyramid under appropriate conditions
  @Test
  public void removeUsingDraw() {
    String r5 = "          A♠" + "\n" + "        A♣  A♦" + "\n" + "      A♥  2♠  2♣" + "\n"
        + "    2♦  2♥  3♠  3♣" + "\n" + "  3♦  3♥  4♠  4♣  4♦" + "\n" + "4♥  5♠  5♣  5♦  5♥  ."
        + "\n" + "Draw: 6♣, 6♥";
    b1.startGame(removeDeck5, false, 6, 2);
    b1.removeUsingDraw(1, 5, 5);
    assertEquals(r5, b1.toString());

    try {
      b1.startGame(removeDeck6, false, 6, 4);
      b1.removeUsingDraw(3, 5, 4);
    } catch (Exception e) {
      new IllegalArgumentException("Removal for requested card is not possible");
    }

    try {
      b1.startGame(removeDeck6, false, 0, 4);
      b1.removeUsingDraw(3, 5, 4);
    } catch (Exception e) {
      new IllegalStateException("Game has not started yet");
    }

  }

  //check if the method removes card in the draw pile that is of value 13 and exposed
  @Test
  public void discardDraw() {
    String r6 = "A♠" + "\n" + "Draw: A♦";
    b1.startGame(removeDeck6, false, 1, 1);
    b1.discardDraw(0);
    assertEquals(r6, b1.toString());

    String r7 = "    A♠" + "\n" + "  K♠  A♦" + "\n" + "A♥  3♠  3♣" + "\n" + "Draw: A♣, A♠";
    b1.startGame(removeDeck6, false, 3, 2);
    b1.discardDraw(1);
    assertEquals(r7, b1.toString());

    try {
      b1.startGame(fullDeck, false, 3, 6);
      b1.discardDraw(5);
    } catch (Exception e) {
      throw new IllegalArgumentException("Removal for requested card is not possible");
    }

    try {
      b1.startGame(fullDeck, false, 0, 6);
      b1.discardDraw(5);
    } catch (Exception e) {
      new IllegalStateException("Game has not started yet");
    }
  }

  //return the row number
  @Test
  public void getNumRows() {
    b1.startGame(fullDeck, true, 8, 2);
    assertEquals(8, b1.getNumRows());

    b1.startGame(removeDeck6, true, 2, 2);
    assertEquals(2, b1.getNumRows());

    b1.startGame(removeDeck4, true, 2, 0);
    //assertEquals(-1, b1.getNumRows());
  }

  //return number of draw cards
  @Test
  public void getNumDraw() {
    assertEquals(-1, b1.getNumDraw());
    b1.startGame(fullDeck, true, 8, 8);
    assertEquals(8, b1.getNumDraw());

    b1.startGame(removeDeck3, true, 2, 6);
    assertEquals(6, b1.getNumDraw());


  }

  //checking if it returns the correct width of row
  @Test
  public void getRowWidth() {
    b1.startGame(removeDeck1, true, 7, 3);
    assertEquals(7, b1.getRowWidth(6));

    b1.startGame(removeDeck3, true, 7, 2);
    assertEquals(2, b1.getRowWidth(1));

    try {
      b1.startGame(removeDeck1, true, 9, 4);
      b1.getRowWidth(10);
    } catch (Exception e) {
      new IllegalArgumentException("Invalid row requested");
    }

    try {
      b1.startGame(removeDeck5, true, 5, 3);
      b1.getRowWidth(0);
    } catch (Exception e) {
      new IllegalArgumentException("Invalid row requested");
    }

    try {
      b1.startGame(removeDeck5, true, 0, 3);
      b1.getRowWidth(0);
    } catch (Exception e) {
      new IllegalStateException("Game has not started yet");
    }
  }

  //Check scenarios where the game is over
  @Test
  public void isGameOver() {
    b1.startGame(winningDeck, false, 2, 1);
    b1.remove(1, 0, 1, 1);
    assertEquals(false, b1.isGameOver());
    b1.removeUsingDraw(0, 0, 0);
    assertEquals(true, b1.isGameOver());

    try {
      b1.startGame(removeDeck5, true, 0, 3);
      b1.isGameOver();
    } catch (Exception e) {
      new IllegalStateException("Game has not started yet");
    }
  }

  //checks if the score is correct
  @Test
  public void getScore() {
    b1.startGame(winningDeck, false, 2, 6);
    assertEquals(23, b1.getScore());
    b1.remove(1, 0, 1, 1);
    assertEquals(10, b1.getScore());
    b1.removeUsingDraw(0, 0, 0);
    assertEquals(0, b1.getScore());
    try {
      b1.startGame(removeDeck5, true, 0, 3);
      b1.isGameOver();
    } catch (Exception e) {
      new IllegalStateException("Game has not started yet");
    }
  }

  //checks if it gets the target card
  @Test
  public void getCardAt() {
    b1.startGame(removeDeck5, false, 4, 5);
    assertEquals(twoClubs, b1.getCardAt(2, 2));

    b1.startGame(winningDeck, false, 2, 1);
    b1.remove(1, 0, 1, 1);
    assertEquals(null, b1.getCardAt(1, 0));

    try {
      b1.startGame(fullDeck, true, 0, 50);
      b1.getCardAt(2, 0);
    } catch (Exception e) {
      new IllegalStateException("Game has not started yet");
    }

    try {
      b1.startGame(removeDeck5, true, 3, 49);
      b1.getCardAt(6, 0);
    } catch (Exception e) {
      new IllegalArgumentException("Invalid card requested");
    }

    try {
      b1.startGame(removeDeck5, true, 3, 49);
      b1.getCardAt(0, 0);
    } catch (Exception e) {
      new IllegalArgumentException("Invalid card requested");
    }
  }

  //checks to see if method return a list of draw cards
  @Test
  public void getDrawCards() {
    List draw = new ArrayList(Arrays
        .asList(twoDiamonds, twoHearts, threeSpades, threeClubs, threeDiamonds, threeHearts,
            fourSpades));
    b1.startGame(fullDeck, false, 3, 7);
    assertEquals(draw, b1.getDrawCards());

    List draw2 = new ArrayList(Arrays
        .asList(sixClubs, sixDiamonds));
    b1.startGame(fullDeck, false, 6, 2);
    assertEquals(draw2, b1.getDrawCards());

  }

  //check if it produces the correct string
  @Test
  public void testToString() {
    String r9 = "          A♠" + "\n" + "        A♣  A♦" + "\n" + "      A♥  2♠  2♣" + "\n"
        + "    2♦  2♥  3♠  3♣" + "\n" + "  3♦  3♥  4♠  4♣  4♦" + "\n" + "4♥  5♠  5♣  5♦  5♥  6♠"
        + "\n" + "Draw: 6♣, 6♦, 6♥";
    b1.startGame(fullDeck, false, 6, 3);
    assertEquals(r9, b1.toString());

    String r10 = "  10♥" + "\n" + "J♦  2♥" + "\n" + "Draw: 3♥";
    String r11 = "  10♥" + "\n" + ".   ." + "\n" + "Draw: 3♥";
    String r12 = "You win!";
    b1.startGame(winningDeck, false, 2, 1);
    assertEquals(r10, b1.toString());
    b1.remove(1, 0, 1, 1);
    assertEquals(r11, b1.toString());
    b1.removeUsingDraw(0, 0, 0);
    assertEquals(r12, b1.toString());

    b1.startGame(fullDeck, false, 1, 1);
    b1.isGameOver();
    assertEquals("A♠" + "\n" + "Draw: A♣", b1.toString());

  }


}