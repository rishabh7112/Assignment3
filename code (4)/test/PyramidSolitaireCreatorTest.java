import static org.junit.Assert.assertEquals;

import cs3500.pyramidsolitaire.model.hw02.BasicPyramidSolitaire;
import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import cs3500.pyramidsolitaire.model.hw04.MultiPyramidSolitaireModel;
import cs3500.pyramidsolitaire.model.hw04.PyramidSolitaireCreator;
import cs3500.pyramidsolitaire.model.hw04.PyramidSolitaireCreator.GameType;
import cs3500.pyramidsolitaire.model.hw04.RelaxedPyramidSolitaireModel;
import org.junit.Test;

/**
 * tests if the factory method instantiates the correct class.
 */
public class PyramidSolitaireCreatorTest {

  PyramidSolitaireModel<Card> p1;
  PyramidSolitaireCreator c1 = new PyramidSolitaireCreator();

  @Test
  public void create() {
    p1 = c1.create(GameType.BASIC);
    assertEquals(BasicPyramidSolitaire.class, p1.getClass());

    p1 = c1.create(GameType.RELAXED);
    assertEquals(RelaxedPyramidSolitaireModel.class, p1.getClass());

    p1 = c1.create(GameType.MULTIPYRAMID);
    assertEquals(MultiPyramidSolitaireModel.class, p1.getClass());
  }
}