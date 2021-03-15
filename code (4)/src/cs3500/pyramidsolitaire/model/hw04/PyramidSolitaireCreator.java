package cs3500.pyramidsolitaire.model.hw04;

import cs3500.pyramidsolitaire.model.hw02.BasicPyramidSolitaire;
import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;

/**
 * represents the factory class in which it creates instances of each class.
 */
public class PyramidSolitaireCreator {

  /**
   * represents each of the models for the game.
   */
  public enum GameType {
    BASIC, RELAXED, MULTIPYRAMID
  }

  /**
   * represents the factory method that creates instances of each model class.
   *
   * @param type represents each type of model that is used for the game
   * @return PyramidSolitaireModel an instance of each model class
   */
  public static PyramidSolitaireModel<Card> create(GameType type) {
    if (type.equals(GameType.BASIC)) {
      return new BasicPyramidSolitaire();
    }
    if (type.equals(GameType.RELAXED)) {
      return new RelaxedPyramidSolitaireModel();
    }
    if (type.equals(GameType.MULTIPYRAMID)) {
      return new MultiPyramidSolitaireModel();
    }
    throw new IllegalArgumentException("invalid game type");
  }
}
