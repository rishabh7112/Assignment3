import static org.junit.Assert.assertEquals;

import cs3500.pyramidsolitaire.controller.PyramidSolitaireController;
import cs3500.pyramidsolitaire.controller.PyramidSolitaireTextualController;
import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.Card.Rank;
import cs3500.pyramidsolitaire.model.hw02.Card.Suit;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import cs3500.pyramidsolitaire.model.hw04.MultiPyramidSolitaireModel;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * tests the controller on the multi pyramid model.
 */
public class MultiPyramidSolitaireTextualControllerTest {

  PyramidSolitaireModel<Card> m1 = new MultiPyramidSolitaireModel();
  StringBuilder out = new StringBuilder();
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
      Arrays.asList(sixSpades, sixClubs, sevenHearts, sixDiamonds,
          sevenDiamonds, twoClubs, twoDiamonds, twoHearts,
          threeSpades, threeClubs, threeDiamonds, threeHearts,
          fourSpades, fourClubs, fourDiamonds, fourHearts,
          fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
          aSpades, aClubs, aDiamonds, aHearts,
          sevenSpades, sevenClubs, twoSpades, sixHearts,
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

  List<Card> multifullDeck3 = new ArrayList(
      Arrays.asList(sixSpades, sixClubs, sixDiamonds, kSpades,
          twoSpades, twoClubs, twoDiamonds, twoHearts,
          threeSpades, threeClubs, threeDiamonds, threeHearts,
          fourSpades, fourClubs, fourDiamonds, fourHearts,
          fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
          aSpades, aClubs, aDiamonds, aHearts,
          sevenSpades, sevenClubs, sevenDiamonds, sixHearts,
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
          sevenHearts, kClubs, kDiamonds, kHearts));

  List<Card> multifullWinningDeck = new ArrayList(
      Arrays.asList(sixSpades, sevenClubs, sixDiamonds, kSpades,
          twoSpades, twoClubs, twoDiamonds, twoHearts,
          threeSpades, threeClubs, threeDiamonds, threeHearts,
          fourSpades, fourClubs, fourDiamonds, fourHearts,
          fiveSpades, fiveClubs, fiveDiamonds, fiveHearts,
          aSpades, aClubs, aDiamonds, aHearts,
          sevenSpades, sixClubs, sevenDiamonds, sixHearts,
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
          sevenHearts, kClubs, kDiamonds, kHearts));

  @Test
  public void playGameNotCorrectRm1() throws IOException {
    Reader in = new StringReader("rm1 4 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck, false, 4, 2);
    assertEquals("      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣\n"
        + "Score: 33\n"
        + "Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣\n"
        + "Score: 33\n"
        + "Game over. Score: 33", out.toString());
  }

  @Test
  public void playGameRm1() throws IOException {
    Reader in = new StringReader("rm1 2 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck3, false, 2, 0);
    assertEquals("  6♠  6♣  6♦\n"
        + "K♠  2♠  2♣  2♦\n"
        + "Draw: \n"
        + "Score: 21\n"
        + "  6♠  6♣  6♦\n"
        + ".   2♠  2♣  2♦\n"
        + "Draw: \n"
        + "Score: 8\n"
        + "Game over. Score: 8", out.toString());
  }

  @Test
  public void playInvlaidGameRm1() throws IOException {
    Reader in = new StringReader("rm1 2 s 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck3, false, 2, 0);
    assertEquals("  6♠  6♣  6♦\n"
        + "K♠  2♠  2♣  2♦\n"
        + "Draw: \n"
        + "Score: 21\n"
        + "  6♠  6♣  6♦\n"
        + ".   2♠  2♣  2♦\n"
        + "Draw: \n"
        + "Score: 8\n"
        + "Game over. Score: 8", out.toString());
  }

  @Test
  public void playInvlaid2GameRm1() throws IOException {
    try {
      Reader in = new StringReader("rm1 l l");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(m1, multifullDeck3, false, 2, 0);
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid inputs", e.getMessage());
    }
  }

  @Test
  public void playNotCorrectGameRm2() throws IOException {
    Reader in = new StringReader("rm2 4 1 4 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck, false, 4, 2);
    assertEquals("      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣\n"
        + "Score: 33\n"
        + "Invalid Move. Play Again. Removal for requested cards is not possible\n"
        + "      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣\n"
        + "Score: 33\n"
        + "Game over. Score: 33", out.toString());
  }

  @Test
  public void playGameRm2() throws IOException {
    Reader in = new StringReader("rm2 2 1 2 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck2, false, 2, 2);
    assertEquals("  6♠  6♣  7♥\n"
        + "6♦  7♦  2♣  2♦\n"
        + "Draw: 2♥, 3♠\n"
        + "Score: 19\n"
        + "  6♠  6♣  7♥\n"
        + ".   .   2♣  2♦\n"
        + "Draw: 2♥, 3♠\n"
        + "Score: 6\n"
        + "Game over. Score: 6", out.toString());
  }

  @Test
  public void playInvalidGameRm2() throws IOException {
    Reader in = new StringReader("rm2 2 1 s l d f 2 2");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck2, false, 2, 2);
    assertEquals("  6♠  6♣  7♥\n"
        + "6♦  7♦  2♣  2♦\n"
        + "Draw: 2♥, 3♠\n"
        + "Score: 19\n"
        + "  6♠  6♣  7♥\n"
        + ".   .   2♣  2♦\n"
        + "Draw: 2♥, 3♠\n"
        + "Score: 6\n"
        + "Game over. Score: 6", out.toString());
  }

  @Test
  public void playInvlaid2GameRm2() throws IOException {
    try {
      Reader in = new StringReader("rm2 l l 3 e");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(m1, multifullDeck3, false, 2, 0);
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid inputs", e.getMessage());
    }
  }


  @Test
  public void playNotCorrectGameRmwd() throws IOException {
    Reader in = new StringReader("rmwd 4 1 4");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck, false, 4, 2);
    assertEquals("      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣\n"
        + "Score: 33\n"
        + "Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣\n"
        + "Score: 33\n"
        + "Game over. Score: 33", out.toString());
  }

  @Test
  public void playGameRmwd() throws IOException {
    Reader in = new StringReader("rmwd 2 1 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck2, false, 1, 2);
    assertEquals("6♠\n"
        + "Draw: 6♣, 7♥\n"
        + "Score: 6\n"
        + "You win!", out.toString());
  }

  @Test
  public void playInvalidGameRmwd() throws IOException {
    Reader in = new StringReader("rmwd 2 1 s d 1 2 ");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck2, false, 1, 2);
    assertEquals("6♠\n"
        + "Draw: 6♣, 7♥\n"
        + "Score: 6\n"
        + "You win!", out.toString());
  }

  @Test
  public void playInvlaid2GameRmwd() throws IOException {
    try {
      Reader in = new StringReader("rmwd l l 3 e");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(m1, multifullDeck3, false, 2, 0);
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid inputs", e.getMessage());
    }
  }


  @Test
  public void playNotCorrectGamedd() throws IOException {
    Reader in = new StringReader("dd 3");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck, false, 4, 2);
    assertEquals("      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣\n"
        + "Score: 33\n"
        + "Invalid Move. Play Again. Removal for requested card is not possible\n"
        + "      A♠  .   A♣  .   A♦\n"
        + "    A♥  2♠  2♣  2♦  2♥  3♠\n"
        + "  3♣  3♦  3♥  4♠  4♣  4♦  4♥\n"
        + "5♠  5♣  5♦  5♥  6♠  6♣  6♦  6♥\n"
        + "Draw: 7♠, 7♣\n"
        + "Score: 33\n"
        + "Game over. Score: 33", out.toString());
  }

  @Test
  public void playGamedd() throws IOException {
    Reader in = new StringReader("dd 7");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck2, false, 1, 9);
    assertEquals("6♠\n"
        + "Draw: 6♣, 7♥, 6♦, 7♦, 2♣, 2♦, 2♥, 3♠, 3♣\n"
        + "Score: 6\n"
        + "6♠\n"
        + "Draw: 6♣, 7♥, 6♦, 7♦, 2♣, 2♦, 3♠, 3♣, 3♦\n"
        + "Score: 6\n"
        + "Game over. Score: 6", out.toString());
  }

  @Test
  public void playInvalidGamedd() throws IOException {
    Reader in = new StringReader("dd t d f e 1 2 ");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck2, false, 1, 2);
    assertEquals("6♠\n"
        + "Draw: 6♣, 7♥\n"
        + "Score: 6\n"
        + "6♠\n"
        + "Draw: 7♥, 6♦\n"
        + "Score: 6\n"
        + "Put proper move \n"
        + "6♠\n"
        + "Draw: 7♥, 6♦\n"
        + "Score: 6\n"
        + "Game over. Score: 6", out.toString());
  }

  @Test
  public void playInvlaid2Gamedd() throws IOException {
    try {
      Reader in = new StringReader("dd l l e");
      pc1 = new PyramidSolitaireTextualController(in, out);
      pc1.playGame(m1, multifullDeck3, false, 2, 0);
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid inputs", e.getMessage());
    }
  }

  @Test
  public void playGameQuit() throws IOException {
    Reader in = new StringReader("dd t d q e 1 2 ");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck2, false, 1, 2);
    assertEquals("6♠\n"
        + "Draw: 6♣, 7♥\n"
        + "Score: 6\n"
        + "Game quit!\n"
        + "State of game when quit:\n"
        + "6♠\n"
        + "Draw: 6♣, 7♥\n"
        + "Score: 6", out.toString());
  }

  @Test
  public void playGameQuit2() throws IOException {
    Reader in = new StringReader("Q");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullDeck2, false, 1, 2);
    assertEquals("6♠\n"
        + "Draw: 6♣, 7♥\n"
        + "Score: 6\n"
        + "Game quit!\n"
        + "State of game when quit:\n"
        + "6♠\n"
        + "Draw: 6♣, 7♥\n"
        + "Score: 6", out.toString());
  }

  @Test
  public void playGameWin() throws IOException {
    Reader in = new StringReader("rmwd 1 1 1");
    pc1 = new PyramidSolitaireTextualController(in, out);
    pc1.playGame(m1, multifullWinningDeck, false, 1, 2);
    assertEquals("6♠\n"
        + "Draw: 7♣, 6♦\n"
        + "Score: 6\n"
        + "You win!", out.toString());
  }


}