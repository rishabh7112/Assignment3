import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.Card.Rank;
import cs3500.pyramidsolitaire.model.hw02.Card.Suit;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import cs3500.pyramidsolitaire.model.hw04.MultiPyramidSolitaireModel;
import cs3500.pyramidsolitaire.view.PyramidSolitaireTextualView;
import cs3500.pyramidsolitaire.view.PyramidSolitaireView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * tests all the overriden methods of the multipyramid model.
 */
public class MultiPyramidSolitaireModelTest {

  PyramidSolitaireModel m1 = new MultiPyramidSolitaireModel();
  StringBuffer b1 = new StringBuffer();
  PyramidSolitaireView v1 = new PyramidSolitaireTextualView(m1, b1);

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

  List<Card> multifullDeck = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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
      kSpades, kClubs, kDiamonds, kHearts, aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> invalidDeck1 = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> invalid2 = new ArrayList(Arrays.asList(aSpades, aSpades, aSpades, aHearts,
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
      kSpades, kClubs, kDiamonds, kHearts, aSpades, aClubs, aDiamonds, aHearts,
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
      kSpades, kClubs, kDiamonds, aClubs));

  List<Card> multifullDeck2 = new ArrayList(
      Arrays.asList(sixSpades, sixClubs, sixDiamonds, sixHearts,
          twoSpades, twoClubs, twoDiamonds, twoHearts,
          threeSpades, threeClubs, threeDiamonds, threeHearts,
          fourSpades, fourClubs, fourDiamonds, fourHearts,
          fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
          aSpades, aClubs, aDiamonds, aHearts,
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
          fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
          sixSpades, sixClubs, sixDiamonds, sixHearts,
          sevenSpades, sevenClubs, sevenDiamonds, sevenHearts,
          eightSpades, eightClubs, eightDiamonds, eightHearts,
          nineSpades, nineClubs, nineDiamonds, nineHearts,
          tenSpades, tenClubs, tenDiamonds, tenHearts,
          jSpades, jClubs, jDiamonds, jHearts,
          qSpades, qClubs, qDiamonds, qHearts,
          kSpades, kClubs, kDiamonds, kHearts));

  @Test
  public void getDeck() throws IOException {
    assertEquals(this.multifullDeck, m1.getDeck());
    assertEquals(multifullDeck.size(), m1.getDeck().size());
  }

  @Test
  public void startGame() throws IOException {
    try {
      m1.startGame(null, false, 2, 3);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Deck can't be null", e.getMessage());

    }

    try {
      m1.startGame(null, false, 2, 3);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Deck can't be null", e.getMessage());

    }

    try {
      m1.startGame(invalidDeck1, false, 2, 3);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Deck is not valid", e.getMessage());
    }

    try {
      m1.startGame(invalid2, true, 4, 4);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Deck is not valid", e.getMessage());
    }

    try {
      m1.startGame(multifullDeck, true, 7, -1);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Num rows and num draw have to be positive", e.getMessage());
    }

    try {
      m1.startGame(multifullDeck, true, 0, 0);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Num rows and num draw have to be positive", e.getMessage());
    }

    try {
      m1.startGame(multifullDeck, true, 9, 0);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Game can't be initialized with given parameters", e.getMessage());
    }

    try {
      m1.startGame(multifullDeck, true, 8, 20);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals("Game can't be initialized with given parameters", e.getMessage());
    }

    m1.startGame(multifullDeck, false, 7, 3);
    assertEquals("            A♠  .   .   A♣  .   .   A♦\n"
        + "          A♥  2♠  .   2♣  2♦  .   2♥  3♠\n"
        + "        3♣  3♦  3♥  4♠  4♣  4♦  4♥  5♠  5♣\n"
        + "      5♦  5♥  6♠  6♣  6♦  6♥  7♠  7♣  7♦  7♥\n"
        + "    8♠  8♣  8♦  8♥  9♠  9♣  9♦  9♥  10♠ 10♣ 10♦\n"
        + "  10♥ J♠  J♣  J♦  J♥  Q♠  Q♣  Q♦  Q♥  K♠  K♣  K♦\n"
        + "K♥  A♠  A♣  A♦  A♥  2♠  2♣  2♦  2♥  3♠  3♣  3♦  3♥\n"
        + "Draw: 4♠, 4♣, 4♦", v1.toString());

    m1.startGame(multifullDeck, false, 4, 3);
    v1.render();
    assertEquals("      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣, 7♦", v1.toString());

    m1.startGame(multifullDeck, false, 1, 0);
    v1.render();
    assertEquals("A♠\n"
        + "Draw: ", v1.toString());

    m1.startGame(multifullDeck, false, 3, 2);
    v1.render();
    assertEquals("    A♠  A♣  A♦\n"
        + "  A♥  2♠  2♣  2♦\n"
        + "2♥  3♠  3♣  3♦  3♥\n"
        + "Draw: 4♠, 4♣", v1.toString());

    m1.startGame(multifullDeck2, false, 4, 8);
    v1.render();
    assertEquals("      6♠  .   6♣  .   6♦\n"
        + "    6♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  A♠  A♣  A♦  A♥\n"
        + "Draw: 7♠, 7♣, 7♦, 7♥, 8♠, 8♣, 8♦, 8♥", v1.toString());

    m1.startGame(multifullDeck2, false, 4, 0);
    v1.render();
    assertEquals("      6♠  .   6♣  .   6♦\n"
        + "    6♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  A♠  A♣  A♦  A♥\n"
        + "Draw: ", v1.toString());
  }

}