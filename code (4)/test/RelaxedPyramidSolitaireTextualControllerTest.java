import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import cs3500.pyramidsolitaire.controller.PyramidSolitaireController;
import cs3500.pyramidsolitaire.controller.PyramidSolitaireTextualController;
import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.Card.Rank;
import cs3500.pyramidsolitaire.model.hw02.Card.Suit;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import cs3500.pyramidsolitaire.model.hw04.RelaxedPyramidSolitaireModel;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * tests the controller for the relaxed pyramid.
 */
public class RelaxedPyramidSolitaireTextualControllerTest {

  PyramidSolitaireModel<Card> r1 = new RelaxedPyramidSolitaireModel();
  StringBuffer out = new StringBuffer();
  PyramidSolitaireController pc1;

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

  List<Card> fullDeck = new ArrayList<>(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> removeDeck1 = new ArrayList<>(
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

  List<Card> removeDeck2 = new ArrayList<>(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> removeDeck3 = new ArrayList<>(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> removeDeck4 = new ArrayList<>(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> removeDeck5 = new ArrayList<>(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> removeDeck6 = new ArrayList<>(Arrays.asList(aSpades, kSpades, aDiamonds, aHearts,
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

  List<Card> removeDeck7 = new ArrayList(Arrays.asList(aSpades, aClubs, aDiamonds, aHearts,
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

  List<Card> winningDeck = new ArrayList<>(
      Arrays.asList(tenHearts, jDiamonds, twoHearts, threeHearts,
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

  List<Card> winDeck2 = new ArrayList(Arrays.asList(qSpades, aClubs, aDiamonds, qClubs,
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


  @Test
  public void playGameRm1ControllerandMock1() {
    Reader in = new StringReader("rm1 4 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck3, false, 4, 2);
    assertEquals("      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  3♠  3♣\n"
        + "K♠  K♣  K♦  K♥\n"
        + "Draw: 3♦, 3♥\n"
        + "Score: 62\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  3♠  3♣\n"
        + ".   K♣  K♦  K♥\n"
        + "Draw: 3♦, 3♥\n"
        + "Score: 49\n"
        + "Game over. Score: 49", out.toString());
  }

  //tests errors of rm1
  @Test
  public void playGameRm1Error1() {
    try {
      Reader in = new StringReader("rm1 1 1");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(r1, removeDeck1, false, 0, 2);
      fail("Didn't throw any Exceptions");

    } catch (IllegalStateException e) {
      assertEquals("The game cannot start with current state", e.getMessage());
    }
  }

  //tests valid rm1 method with mock and controller
  @Test
  public void playGameRm1ControllerandMock2() {
    Reader in = new StringReader("rm1 5 3");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck4, false, 5, 4);
    assertEquals("        A♠\n"
        + "      A♣  A♦\n"
        + "    A♥  3♠  3♣\n"
        + "  K♠  K♣  A♠  K♥\n"
        + "3♦  3♥  K♦  4♠  4♣\n"
        + "Draw: 4♦, 4♥, 5♠, 5♣\n"
        + "Score: 77\n"
        + "        A♠\n"
        + "      A♣  A♦\n"
        + "    A♥  3♠  3♣\n"
        + "  K♠  K♣  A♠  K♥\n"
        + "3♦  3♥  .   4♠  4♣\n"
        + "Draw: 4♦, 4♥, 5♠, 5♣\n"
        + "Score: 64\n"
        + "Game over. Score: 64", out.toString());
  }

  //tests error of rm1 method
  @Test
  public void playGameRm1Error2() {
    Reader in = new StringReader("rm1 1 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, fullDeck, false, 7, 2);
    assertEquals("            A♠\n"
        + "          A♣  A♦\n"
        + "        A♥  2♠  2♣\n"
        + "      2♦  2♥  3♠  3♣\n"
        + "    3♦  3♥  4♠  4♣  4♦\n"
        + "  4♥  5♠  5♣  5♦  5♥  6♠\n"
        + "6♣  6♦  6♥  7♠  7♣  7♦  7♥\n"
        + "Draw: 8♠, 8♣\n"
        + "Score: 112\n"
        + "Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "            A♠\n"
        + "          A♣  A♦\n"
        + "        A♥  2♠  2♣\n"
        + "      2♦  2♥  3♠  3♣\n"
        + "    3♦  3♥  4♠  4♣  4♦\n"
        + "  4♥  5♠  5♣  5♦  5♥  6♠\n"
        + "6♣  6♦  6♥  7♠  7♣  7♦  7♥\n"
        + "Draw: 8♠, 8♣\n"
        + "Score: 112\n"
        + "Game over. Score: 112", out.toString());
  }

  //tests valid rm2 method with mock and controller
  @Test
  public void playGameRm2ControllerandMock1() {
    Reader in = new StringReader("rm2 2 1 2 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck1, false, 2, 2);
    assertEquals("  10♥\n"
        + "7♦  6♠\n"
        + "Draw: A♠, A♣\n"
        + "Score: 23\n"
        + "  10♥\n"
        + ".   .\n"
        + "Draw: A♠, A♣\n"
        + "Score: 10\n"
        + "Game over. Score: 10", out.toString());
  }

  //tests for error cases in rm2 method
  @Test
  public void playGameRm2Error1() {
    Reader in = new StringReader("rm2 4 4 4 5");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck2, false, 4, 2);
    assertEquals("      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  9♣  4♠\n"
        + "2♠  2♣  2♦  2♥\n"
        + "Draw: 3♠, 3♣\n"
        + "Score: 25\n"
        + "Invalid Move. Play Again. Removal for requested cards is not possible\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  9♣  4♠\n"
        + "2♠  2♣  2♦  2♥\n"
        + "Draw: 3♠, 3♣\n"
        + "Score: 25\n"
        + "Game over. Score: 25", out.toString());
  }

  //tests valid rm1 method with mock and controller
  @Test
  public void playGameRm2ControllerandMock2() {
    Reader in = new StringReader("rm2 3 2 3 3");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck2, false, 3, 3);
    assertEquals("    A♠\n"
        + "  A♣  A♦\n"
        + "A♥  9♣  4♠\n"
        + "Draw: 2♠, 2♣, 2♦\n"
        + "Score: 17\n"
        + "    A♠\n"
        + "  A♣  A♦\n"
        + "A♥  .   .\n"
        + "Draw: 2♠, 2♣, 2♦\n"
        + "Score: 4\n"
        + "Game over. Score: 4", out.toString());
  }

  //tests error for rm2 method
  @Test
  public void playGameRm2Error2() {
    try {
      Reader in = new StringReader("rm2 1 4 3 4");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(r1, removeDeck1, false, 0, 2);
      fail("Didn't throw any Exceptions");
    } catch (IllegalStateException e) {
      assertEquals("The game cannot start with current state", e.getMessage());
    }


  }

  //tests valid rmwd method with mock and controller
  @Test
  public void playGameRmwdControllerandMock1() {
    Reader in = new StringReader("rmwd 2 6 6");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck5, false, 6, 2);
    assertEquals("          A♠\n"
        + "        A♣  A♦\n"
        + "      A♥  2♠  2♣\n"
        + "    2♦  2♥  3♠  3♣\n"
        + "  3♦  3♥  4♠  4♣  4♦\n"
        + "4♥  5♠  5♣  5♦  5♥  6♠\n"
        + "Draw: 6♣, 7♠\n"
        + "Score: 66\n"
        + "          A♠\n"
        + "        A♣  A♦\n"
        + "      A♥  2♠  2♣\n"
        + "    2♦  2♥  3♠  3♣\n"
        + "  3♦  3♥  4♠  4♣  4♦\n"
        + "4♥  5♠  5♣  5♦  5♥  .\n"
        + "Draw: 6♣, 6♥\n"
        + "Score: 60\n"
        + "Game over. Score: 60", out.toString());
  }

  //tests error for rmwd method
  @Test
  public void playGameRmwdError1() {
    Reader in = new StringReader("rmwd 4 6 5");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck6, false, 6, 4);
    assertEquals("          A♠\n"
        + "        K♠  A♦\n"
        + "      A♥  3♠  3♣\n"
        + "    A♣  K♣  A♠  K♥\n"
        + "  3♦  3♥  K♦  4♠  4♣\n"
        + "4♦  4♥  5♠  5♣  5♦  5♥\n"
        + "Draw: 6♠, 6♣, 6♦, 6♥\n"
        + "Score: 105\n"
        + "Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "          A♠\n"
        + "        K♠  A♦\n"
        + "      A♥  3♠  3♣\n"
        + "    A♣  K♣  A♠  K♥\n"
        + "  3♦  3♥  K♦  4♠  4♣\n"
        + "4♦  4♥  5♠  5♣  5♦  5♥\n"
        + "Draw: 6♠, 6♣, 6♦, 6♥\n"
        + "Score: 105\n"
        + "Game over. Score: 105", out.toString());
  }

  //tests error for rmwd method
  @Test
  public void playGameRmwdError2() {
    try {
      Reader in = new StringReader("rmwd 4 6 5");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(r1, removeDeck1, false, 0, 4);
      fail("Didn't throw any Exceptions");
    } catch (IllegalStateException e) {
      assertEquals("The game cannot start with current state", e.getMessage());
    }
  }

  //tests error for rmwd method
  @Test
  public void playGameRmwdError3() {
    Reader in = new StringReader("rmwd 4 6 5");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck1, false, 1, 0);
    assertEquals("10♥\n"
        + "Draw: \n"
        + "Score: 10\n"
        + "Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "10♥\n"
        + "Draw: \n"
        + "Score: 10\n"
        + "Game over. Score: 10", out.toString());

  }

  //tests valid dd method with mock and controller
  @Test
  public void playGameddControllerandMock1() {
    Reader in = new StringReader("dd 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck6, false, 1, 1);
    assertEquals("A♠\n"
        + "Draw: K♠\n"
        + "Score: 1\n"
        + "A♠\n"
        + "Draw: A♦\n"
        + "Score: 1\n"
        + "Game over. Score: 1", out.toString());
  }

  //tests valid dd method with mock and controller
  @Test
  public void playGameddControllerandMock2() {
    Reader in = new StringReader("dd 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck6, false, 3, 2);
    assertEquals("    A♠\n"
        + "  K♠  A♦\n"
        + "A♥  3♠  3♣\n"
        + "Draw: A♣, K♣\n"
        + "Score: 22\n"
        + "    A♠\n"
        + "  K♠  A♦\n"
        + "A♥  3♠  3♣\n"
        + "Draw: A♣, A♠\n"
        + "Score: 22\n"
        + "Game over. Score: 22", out.toString());
  }

  //tests error for dd method
  @Test
  public void playGameddError2() {
    Reader in = new StringReader("dd 8");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck1, false, 3, 4);
    assertEquals("    10♥\n"
        + "  7♦  6♠\n"
        + "A♠  A♣  A♦\n"
        + "Draw: A♥, 2♠, 2♣, 2♦\n"
        + "Score: 26\n"
        + "Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "    10♥\n"
        + "  7♦  6♠\n"
        + "A♠  A♣  A♦\n"
        + "Draw: A♥, 2♠, 2♣, 2♦\n"
        + "Score: 26\n"
        + "Game over. Score: 26", out.toString());
  }

  //tests quit cases
  @Test
  public void playGameQuit() {
    Reader in = new StringReader("rm1 4 q 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck3, false, 4, 2);
    assertEquals("      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  3♠  3♣\n"
        + "K♠  K♣  K♦  K♥\n"
        + "Draw: 3♦, 3♥\n"
        + "Score: 62\n"
        + "Game quit!\n"
        + "State of game when quit:\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  3♠  3♣\n"
        + "K♠  K♣  K♦  K♥\n"
        + "Draw: 3♦, 3♥\n"
        + "Score: 62", out.toString());

  }

  //tests quit cases
  @Test
  public void playGameQuit2() {
    Reader in = new StringReader("rm1 4 1 rm1 4 2 Q");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck3, false, 4, 2);
    assertEquals("      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  3♠  3♣\n"
        + "K♠  K♣  K♦  K♥\n"
        + "Draw: 3♦, 3♥\n"
        + "Score: 62\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  3♠  3♣\n"
        + ".   K♣  K♦  K♥\n"
        + "Draw: 3♦, 3♥\n"
        + "Score: 49\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  3♠  3♣\n"
        + ".   .   K♦  K♥\n"
        + "Draw: 3♦, 3♥\n"
        + "Score: 36\n"
        + "Game quit!\n"
        + "State of game when quit:\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  3♠  3♣\n"
        + ".   .   K♦  K♥\n"
        + "Draw: 3♦, 3♥\n"
        + "Score: 36", out.toString());

  }

  //tests error for playgame method
  @Test
  public void playGameError() {
    try {
      Reader in = new StringReader("dd 4");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(null, removeDeck1, false, 0, 4);
      fail("Didn't throw any Exceptions");
    } catch (IllegalArgumentException e) {
      assertEquals("Model or deck is null", e.getMessage());
    }
  }

  //tests invalid inputs
  @Test
  public void playGameError2() {
    try {
      Reader in = new StringReader("rmwd -1 a b");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(r1, removeDeck1, false, 1, 4);
      fail("Didn't throw any Exceptions");
    } catch (IllegalStateException e) {
      assertEquals("No more inputs available", e.getMessage());
    }
  }

  //tests the winning case
  @Test
  public void playGameWin() {
    Reader in = new StringReader("rm2 2 1 2 2 rmwd 1 1 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, winningDeck, false, 2, 1);
    assertEquals("  10♥\n"
        + "J♦  2♥\n"
        + "Draw: 3♥\n"
        + "Score: 23\n"
        + "  10♥\n"
        + ".   .\n"
        + "Draw: 3♥\n"
        + "Score: 10\n"
        + "You win!", out.toString());
  }

  @Test
  public void playGameRelaxedRemove() {
    Reader in = new StringReader("rm1 4 2 rm1 4 3 rm1 4 4 rm2 4 1 3 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, removeDeck7, false, 4, 3);
    assertEquals("      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  2♠  2♣\n"
        + "Q♥  K♥  K♣  K♦\n"
        + "Draw: 3♦, K♠, 4♠\n"
        + "Score: 59\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  2♠  2♣\n"
        + "Q♥  .   K♣  K♦\n"
        + "Draw: 3♦, K♠, 4♠\n"
        + "Score: 46\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  2♠  2♣\n"
        + "Q♥  .   .   K♦\n"
        + "Draw: 3♦, K♠, 4♠\n"
        + "Score: 33\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  2♠  2♣\n"
        + "Q♥  .   .   .\n"
        + "Draw: 3♦, K♠, 4♠\n"
        + "Score: 20\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  .   2♠  2♣\n"
        + ".   .   .   .\n"
        + "Draw: 3♦, K♠, 4♠\n"
        + "Score: 7\n"
        + "Game over. Score: 7", out.toString());
  }

  @Test
  public void playGameRelaxedRemove1() {
    Reader in = new StringReader("rmwd 1 2 2 rm2 1 1 2 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(r1, winDeck2, false, 2, 1);
    assertEquals("  Q♠\n"
        + "A♣  A♦\n"
        + "Draw: Q♣\n"
        + "Score: 14\n"
        + "  Q♠\n"
        + "A♣  .\n"
        + "Draw: 2♠\n"
        + "Score: 13\n"
        + "You win!", out.toString());
  }

}