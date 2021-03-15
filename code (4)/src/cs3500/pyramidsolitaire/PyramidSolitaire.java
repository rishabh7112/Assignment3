package cs3500.pyramidsolitaire;

import cs3500.pyramidsolitaire.controller.PyramidSolitaireController;
import cs3500.pyramidsolitaire.controller.PyramidSolitaireTextualController;
import cs3500.pyramidsolitaire.model.hw02.Card;
import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import cs3500.pyramidsolitaire.model.hw04.PyramidSolitaireCreator;
import cs3500.pyramidsolitaire.model.hw04.PyramidSolitaireCreator.GameType;
import java.io.InputStreamReader;

/**
 * represents the class that executes the game in real time using the main method.
 */
public final class PyramidSolitaire {

  /**
   * this is the main method where you can test play the game with various models.
   */
  public static void main(String[] args) {
    PyramidSolitaireController controller = new PyramidSolitaireTextualController(
        new InputStreamReader(System.in), System.out);
    PyramidSolitaireModel<Card> model;
    switch (args[0]) {

      case "basic":
        model = PyramidSolitaireCreator.create(GameType.BASIC);
        break;

      case "relaxed":
        model = PyramidSolitaireCreator.create(GameType.RELAXED);
        break;

      case "multipyramid":
        model = PyramidSolitaireCreator.create(GameType.MULTIPYRAMID);
        break;
      case "q":
      case "Q":
        return;

      default:
        return;
    }
    if (args.length == 1) {
      controller.playGame(model, model.getDeck(), true, 7, 3);

    }
    int a = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);
    controller.playGame(model, model.getDeck(), true, a, b);
  }
}