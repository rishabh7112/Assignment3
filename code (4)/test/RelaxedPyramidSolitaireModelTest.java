import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.Card.Rank;
import cs3500.pyramidsolitaire.model.hw02.Card.Suit;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import cs3500.pyramidsolitaire.model.hw04.RelaxedPyramidSolitaireModel;
import cs3500.pyramidsolitaire.view.PyramidSolitaireTextualView;
import cs3500.pyramidsolitaire.view.PyramidSolitaireView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * tests all the overriden methods of the relaxedpyramid model.
 */
public class RelaxedPyramidSolitaireModelTest {

  PyramidSolitaireModel r1 = new RelaxedPyramidSolitaireModel();
  StringBuffer b1 = new StringBuffer();
  PyramidSolitaireView v1 = new PyramidSolitaireTextualView(r1, b1);

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

  List<Card> fullDeck = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> winDeck = new ArrayList(Arrays.asList(qSpades, aClubs, aDiamonds, qClubs,
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
      aSpades, aHearts, qDiamonds, qHearts,
      kSpades, kClubs, kDiamonds, kHearts));

  List<Card> rm2Deck = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, qSpades,
      twoSpades, twoClubs, jDiamonds, twoHearts,
      threeSpades, threeClubs, threeDiamonds, threeHearts,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, twoDiamonds, jHearts,
      aHearts, qClubs, qDiamonds, qHearts,
      kSpades, kClubs, kDiamonds, kHearts));

  List<Card> removeDeck1 = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
      twoSpades, twoClubs, qHearts, kHearts,
      kClubs, kDiamonds, threeDiamonds, kSpades,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
      sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, twoDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, jDiamonds,
      twoHearts, threeSpades, threeClubs, threeHearts));

  List<Card> gameOverDeck = new ArrayList(Arrays.asList(sixSpades, sixClubs, sixDiamonds, sixHearts,
      sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
      eightSpades, eightClubs, eightDiamonds, eightHearts,
      nineSpades, nineClubs, nineDiamonds, nineHearts,
      tenSpades, tenClubs, tenDiamonds, tenHearts,
      jSpades, jClubs, jDiamonds, jHearts,
      qSpades, qClubs, qDiamonds, qHearts,
      kSpades, kClubs, kDiamonds, kHearts, aSpades, aClubs, aDiamonds, aHearts,
      twoSpades, twoClubs, twoDiamonds, twoHearts,
      threeSpades, threeClubs, threeDiamonds, threeHearts,
      fourSpades, fourClubs, fourDiamonds, fourHearts,
      fiveSpades, fiveClubs, fiveDiamonds, fiveHearts));


  @Test
  public void remove() throws IOException {
    try {
      r1.remove(1, 2, 3, 4);
      fail("Didn't throw Exceptions");
    } catch (IllegalStateException e) {
      assertEquals("Game has not started yet", e.getMessage());
    }

    try {
      r1.startGame(fullDeck, false, 2, 3);
      r1.remove(1, 1, 1, 1);
      fail("Didn't throw Exceptions");
    } catch (IllegalArgumentException e) {
      assertEquals("Removal for requested cards is not possible", e.getMessage());
    }

    r1.startGame(rm2Deck, false, 3, 2);
    r1.removeUsingDraw(0, 2, 1);
    r1.remove(2, 0, 1, 0);
    v1.render();
    assertEquals("    A♠\n"
        + "  .   A♦\n"
        + ".   .   2♣\n"
        + "Draw: 2♥, 3♠", v1.toString());

    r1.startGame(removeDeck1, false, 4, 3);
    r1.remove(3, 1);
    r1.remove(3, 2);
    r1.remove(3, 3);
    r1.remove(3, 0, 2, 0);
    v1.render();
    assertEquals("      A♠\n"
        + "    A♣  A♦\n"
        + "  .   2♠  2♣\n"
        + ".   .   .   .\n"
        + "Draw: 3♦, K♠, 4♠", v1.toString());

    try {
      r1.startGame(removeDeck1, false, 4, 3);
      r1.remove(3, 0, 2, 0);
      fail("Didn't throw Exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Removal for requested cards is not possible", e.getMessage());
    }

    try {
      r1.startGame(rm2Deck, false, 7, 3);
      r1.remove(1, 3, 7, 6);
    } catch (IllegalArgumentException e) {
      assertEquals("Removal for requested cards is not possible", e.getMessage());
    }

    r1.startGame(winDeck, false, 2, 1);
    r1.removeUsingDraw(0, 1, 1);
    r1.remove(0, 0, 1, 0);
    v1.render();
    assertEquals("You win!", v1.toString());
  }

  @Test
  public void isGameOver() throws IOException {
    try {
      r1.isGameOver();
      fail("Didn't throw Exceptions");
    } catch (IllegalStateException e) {
      assertEquals("Game has not started yet", e.getMessage());
    }

    r1.startGame(winDeck, false, 2, 1);
    assertEquals(r1.isGameOver(), false);
    r1.removeUsingDraw(0, 1, 1);
    assertEquals(r1.isGameOver(), false);
    r1.remove(0, 0, 1, 0);
    assertEquals(r1.isGameOver(), true);
    v1.render();
    assertEquals("You win!", v1.toString());
  }
}