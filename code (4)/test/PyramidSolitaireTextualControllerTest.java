import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import cs3500.pyramidsolitaire.controller.PyramidSolitaireController;
import cs3500.pyramidsolitaire.controller.PyramidSolitaireTextualController;
import cs3500.pyramidsolitaire.model.hw02.BasicPyramidSolitaire;
import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.Card.Rank;
import cs3500.pyramidsolitaire.model.hw02.Card.Suit;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.junit.Test;

/**
 * Tests the controller class for basic pyramid.
 */
public class PyramidSolitaireTextualControllerTest {

  /**
   * represents the mock model of the pyramidsolitaire model.
   */
  public class MockModel implements PyramidSolitaireModel<Card> {

    StringBuilder log = new StringBuilder();

    MockModel(StringBuilder log) {
      this.log = log;
    }

    @Override
    public List<Card> getDeck() {
      return null;
    }

    @Override
    public void startGame(List<Card> deck, boolean shuffle, int numRows, int numDraw)
        throws IllegalArgumentException {

      //not important as user doesn't use this method
    }

    //appends the inputs for a 4 argument remove method
    @Override
    public void remove(int row1, int card1, int row2, int card2)
        throws IllegalArgumentException, IllegalStateException {
      log.append("rm2 ").append(row1 + 1).append(" ").append(card1 + 1).append(" ").append(row2 + 1)
          .append(" ").append(card2 + 1);

    }

    //appends the inputs for a 2 argument remove method
    @Override
    public void remove(int row, int card) throws IllegalArgumentException, IllegalStateException {
      log.append("rm1 ").append(row + 1).append(" ").append(card + 1);
    }

    //appends the inputs for the removeUsingDraw method
    @Override
    public void removeUsingDraw(int drawIndex, int row, int card)
        throws IllegalArgumentException, IllegalStateException {
      log.append("rmwd ").append(drawIndex + 1).append(" ").append(row + 1).append(" ")
          .append(card + 1);
    }

    //appends the inputs for the discardDraw method
    @Override
    public void discardDraw(int drawIndex) throws IllegalArgumentException, IllegalStateException {
      log.append("dd ").append(drawIndex + 1);

    }

    @Override
    public int getNumRows() {
      return 0;
    }

    @Override
    public int getNumDraw() {
      return 0;
    }

    @Override
    public int getRowWidth(int row) {
      return 0;
    }

    @Override
    public boolean isGameOver() throws IllegalStateException {
      return false;
    }

    @Override
    public int getScore() throws IllegalStateException {
      return 0;
    }

    @Override
    public Card getCardAt(int row, int card) throws IllegalStateException {
      return null;
    }

    @Override
    public List<Card> getDrawCards() throws IllegalStateException {
      return null;
    }

  }


  PyramidSolitaireModel<Card> b1 = new BasicPyramidSolitaire();
  StringBuilder log = new StringBuilder();
  PyramidSolitaireModel<Card> b2 = new MockModel(log);
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


  //tests valid rm1 method with mock
  @Test
  public void playGameRm1Controller1() {
    Reader in = new StringReader("rm1 4 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b2, removeDeck3, false, 4, 2);
    Scanner scan = new Scanner(log.toString());
    assertEquals("rm1", scan.next());
    assertEquals(4, scan.nextInt());
    assertEquals(1, scan.nextInt());
    assertEquals("rm1 " + 4 + " " + 1, log.toString());

  }

  //tests valid rm1 method with mock and controller
  @Test
  public void playGameRm1ControllerandMock1() {
    Reader in = new StringReader("rm1 4 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck3, false, 4, 2);
    assertEquals("      A♠\n"
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
      pc1.playGame(b1, removeDeck1, false, 0, 2);
      fail("Didn't throw any Exceptions");

    } catch (IllegalStateException e) {
      assertEquals("The game cannot start with current state", e.getMessage());
    }
  }

  //tests valid rm1 method with mock
  @Test
  public void playGameRm1Controller2() {

    Reader in = new StringReader("rm1 5 3");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b2, removeDeck4, false, 5, 4);
    Scanner scan = new Scanner(log.toString());
    assertEquals("rm1", scan.next());
    assertEquals(5, scan.nextInt());
    assertEquals(3, scan.nextInt());
    assertEquals("rm1 " + 5 + " " + 3, log.toString());
  }

  //tests valid rm1 method with mock and controller
  @Test
  public void playGameRm1ControllerandMock2() {
    Reader in = new StringReader("rm1 5 3");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck4, false, 5, 4);
    assertEquals("        A♠\n"
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
    pc1.playGame(b1, fullDeck, false, 7, 2);
    assertEquals("Invalid Move. Play Again. Removal for requested card is not possible\n"
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

  //tests valid rm2 method with mock
  @Test
  public void playGameRm2Controller1() {

    Reader in = new StringReader("rm2 2 1 2 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b2, removeDeck1, false, 2, 2);
    Scanner scan = new Scanner(log.toString());
    assertEquals("rm2", scan.next());
    assertEquals(2, scan.nextInt());
    assertEquals(1, scan.nextInt());
    assertEquals(2, scan.nextInt());
    assertEquals(2, scan.nextInt());
    assertEquals("rm2 " + 2 + " " + 1 + " " + 2 + " " + 2, log.toString());
  }


  //tests valid rm2 method with mock and controller
  @Test
  public void playGameRm2ControllerandMock1() {
    Reader in = new StringReader("rm2 2 1 2 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck1, false, 2, 2);
    assertEquals("  10♥\n"
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
    pc1.playGame(b1, removeDeck2, false, 4, 2);
    assertEquals("Invalid Move. Play Again. Removal for requested cards is not possible\n"
        + "      A♠\n"
        + "    A♣  A♦\n"
        + "  A♥  9♣  4♠\n"
        + "2♠  2♣  2♦  2♥\n"
        + "Draw: 3♠, 3♣\n"
        + "Score: 25\n"
        + "Game over. Score: 25", out.toString());
  }

  //tests valid rm2 method with mock
  @Test
  public void playGameRm2Controller2() {

    Reader in = new StringReader("rm2 3 2 3 3");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b2, removeDeck2, false, 3, 3);
    Scanner scan = new Scanner(log.toString());
    assertEquals("rm2", scan.next());
    assertEquals(3, scan.nextInt());
    assertEquals(2, scan.nextInt());
    assertEquals(3, scan.nextInt());
    assertEquals(3, scan.nextInt());
    assertEquals("rm2 " + 3 + " " + 2 + " " + 3 + " " + 3, log.toString());
  }

  //tests valid rm1 method with mock and controller
  @Test
  public void playGameRm2ControllerandMock2() {
    Reader in = new StringReader("rm2 3 2 3 3");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck2, false, 3, 3);
    assertEquals("    A♠\n"
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
      pc1.playGame(b1, removeDeck1, false, 0, 2);
      fail("Didn't throw any Exceptions");
    } catch (IllegalStateException e) {
      assertEquals("The game cannot start with current state", e.getMessage());
    }


  }

  //tests valid rmwd method with mock
  @Test
  public void playGameRmwdController1() {

    Reader in = new StringReader("rmwd 2 6 6");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b2, removeDeck5, false, 6, 2);
    Scanner scan = new Scanner(log.toString());
    assertEquals("rmwd", scan.next());
    assertEquals(2, scan.nextInt());
    assertEquals(6, scan.nextInt());
    assertEquals(6, scan.nextInt());
    assertEquals("rmwd " + 2 + " " + 6 + " " + 6, log.toString());
  }

  //tests valid rmwd method with mock and controller
  @Test
  public void playGameRmwdControllerandMock1() {
    Reader in = new StringReader("rmwd 2 6 6");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck5, false, 6, 2);
    assertEquals("          A♠\n"
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
    pc1.playGame(b1, removeDeck6, false, 6, 4);
    assertEquals("Invalid Move. Play Again. Removal for requested card is not possible\n"
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
      pc1.playGame(b1, removeDeck1, false, 0, 4);
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
    pc1.playGame(b1, removeDeck1, false, 1, 0);
    assertEquals("Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "10♥\n"
        + "Draw: \n"
        + "Score: 10\n"
        + "Game over. Score: 10", out.toString());

  }

  //tests valid dd method with mock
  @Test
  public void playGameddController1() {

    Reader in = new StringReader("dd 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b2, removeDeck6, false, 1, 1);
    Scanner scan = new Scanner(log.toString());
    assertEquals("dd", scan.next());
    assertEquals(1, scan.nextInt());
    assertEquals("dd " + 1, log.toString());
  }

  //tests valid dd method with mock and controller
  @Test
  public void playGameddControllerandMock1() {
    Reader in = new StringReader("dd 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck6, false, 1, 1);
    assertEquals("A♠\n"
        + "Draw: A♦\n"
        + "Score: 1\n"
        + "Game over. Score: 1", out.toString());
  }


  //tests valid dd method with mock
  @Test
  public void playGameddController2() {

    Reader in = new StringReader("dd 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b2, removeDeck6, false, 3, 2);
    Scanner scan = new Scanner(log.toString());
    assertEquals("dd", scan.next());
    assertEquals(2, scan.nextInt());
    assertEquals("dd " + 2, log.toString());
  }

  //tests valid dd method with mock and controller
  @Test
  public void playGameddControllerandMock2() {
    Reader in = new StringReader("dd 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck6, false, 3, 2);
    assertEquals("    A♠\n"
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
    pc1.playGame(b1, removeDeck1, false, 3, 4);
    assertEquals("Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "    10♥\n"
        + "  7♦  6♠\n"
        + "A♠  A♣  A♦\n"
        + "Draw: A♥, 2♠, 2♣, 2♦\n"
        + "Score: 26\n"
        + "Game over. Score: 26", out.toString());

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

  //tests quit cases
  @Test
  public void playGameQuit() {
    Reader in = new StringReader("rm1 4 q 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck3, false, 4, 2);
    assertEquals("Game quit!\n"
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
    pc1.playGame(b1, removeDeck3, false, 4, 2);
    assertEquals("      A♠\n"
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

  //tests invalid inputs
  @Test
  public void playGameError2() {
    try {
      Reader in = new StringReader("rmwd -1 a b");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(b1, removeDeck1, false, 1, 4);
      fail("Didn't throw any Exceptions");
    } catch (IllegalStateException e) {
      assertEquals("No more inputs available", e.getMessage());
    }
  }

  //tests if it can skip over invalid inputs and go to the correct outputs
  @Test
  public void playGameError3() {
    Reader in = new StringReader("rm2 a b l -1 2 1 2 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck1, false, 2, 4);
    assertEquals("  10♥\n"
        + ".   .\n"
        + "Draw: A♠, A♣, A♦, A♥\n"
        + "Score: 10\n"
        + "Game over. Score: 10", out.toString());

  }

  //tests for multiple commands
  @Test
  public void playGameError4() {
    try {
      Reader in = new StringReader("rm1 -1 2 rm2 -2 2 12 1 rmwd 1 -4 -1 dd -1");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(b1, removeDeck1, false, 2, 4);
      fail("Didn't throw any Exceptions");
    } catch (IllegalStateException e) {
      assertEquals("No more inputs available", e.getMessage());
    }
  }

  //tests for when the deck is null
  @Test
  public void playGameError5() {
    try {
      Reader in = new StringReader("rm1 -1 2 rm2 -2 2 12 1 rmwd 1 -4 -1 dd -1");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(b1, null, false, 2, 4);
      fail("Didn't throw any Exceptions");
    } catch (IllegalArgumentException e) {
      assertEquals("Model or deck is null", e.getMessage());
    }
  }

  //tests if the user puts the incorrect command
  @Test
  public void playGameError6() {
    Reader in = new StringReader("lm1 2 3");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck1, false, 2, 4);
    assertEquals("Put proper move  10♥\n"
        + "7♦  6♠\n"
        + "Draw: A♠, A♣, A♦, A♥\n"
        + "Score: 23\n"
        + "Put proper move  10♥\n"
        + "7♦  6♠\n"
        + "Draw: A♠, A♣, A♦, A♥\n"
        + "Score: 23\n"
        + "Put proper move  10♥\n"
        + "7♦  6♠\n"
        + "Draw: A♠, A♣, A♦, A♥\n"
        + "Score: 23\n"
        + "Game over. Score: 23", out.toString());
  }

  //tests if the user puts the incorrect inputs
  @Test
  public void playGameError7() {
    Reader in = new StringReader("rm2 2 1 2 lm2 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, removeDeck1, false, 2, 2);
    assertEquals("  10♥\n"
        + ".   .\n"
        + "Draw: A♠, A♣\n"
        + "Score: 10\n"
        + "Game over. Score: 10", out.toString());
  }


  //tests the winning case
  @Test
  public void playGameWin() {
    Reader in = new StringReader("rm2 2 1 2 2 rmwd 1 1 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(b1, winningDeck, false, 2, 1);
    assertEquals("  10♥\n"
        + ".   .\n"
        + "Draw: 3♥\n"
        + "Score: 10\n"
        + "You win!", out.toString());

  }


}

