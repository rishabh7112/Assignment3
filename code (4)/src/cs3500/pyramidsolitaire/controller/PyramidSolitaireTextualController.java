package cs3500.pyramidsolitaire.controller;

import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import cs3500.pyramidsolitaire.view.PyramidSolitaireTextualView;
import cs3500.pyramidsolitaire.view.PyramidSolitaireView;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * represents the controller for the basic pyramid model. It reads the inputs from users and calls
 * methods from the model accordingly.
 */
public class PyramidSolitaireTextualController implements PyramidSolitaireController {

  private Appendable ap;
  private final Scanner scan;

  /**
   * represents the constructor for the PyramidSolitaireTextualController.
   *
   * @param rd represents the Readable to read inputs
   * @param ap represents the Appendable that outputs the inputs
   * @throws IllegalArgumentException if Readable or Appendable are null
   */

  public PyramidSolitaireTextualController(Readable rd, Appendable ap)
      throws IllegalArgumentException {
    if (rd == null || ap == null) {
      throw new IllegalArgumentException("Invalid arguments");
    }
    this.ap = ap;
    this.scan = new Scanner(rd);
  }

  //checks if each input is either a q,Q, or a number
  private boolean getInput(int[] inputs, int n) {
    for (int i = 0; i < n; i++) {
      String valid;
      while (true) {
        try {
          String next = scan.next();
          if (next.toLowerCase().equals("q")) {
            valid = "q";
            break;
          } else {
            try {
              Integer.parseInt(next);
              valid = next;
              break;
            } catch (NumberFormatException e) {
              continue;
            }
          }
        } catch (IllegalStateException e) {
          throw new IllegalStateException("No more inputs available");
        }
      }
      if (valid.equals("q")) {
        return false;
      }
      inputs[i] = Integer.parseInt(valid);
    }
    return true;
  }

  //produces the quit message
  private <K> void quitMessage(PyramidSolitaireModel<K> model) throws IOException {
    PyramidSolitaireView p = new PyramidSolitaireTextualView(model);
    ap.append(
        "Game quit!" + "\n" + "State of game when quit:" + "\n" + p.toString() + "\n"
            + "Score: " + model.getScore());
  }

  /**
   * The primary method for beginning and playing a game.
   *
   * @param <K>     the type of cards used by the model.
   * @param model   The game of solitaire to be played
   * @param deck    The deck of cards to be used
   * @param shuffle Whether to shuffle the deck or not
   * @param numRows How many rows should be in the pyramid
   * @param numDraw How many draw cards should be visible
   * @throws IllegalArgumentException if the model or deck is null
   * @throws IllegalStateException    if the game cannot be started, or if the controller cannot
   *                                  interact with the player.
   */
  @Override
  public <K> void playGame(PyramidSolitaireModel<K> model, List<K> deck, boolean shuffle,
      int numRows, int numDraw)
      throws IllegalArgumentException, IllegalStateException {

    if (model == null || deck == null) {
      throw new IllegalArgumentException("Model or deck is null");
    }

    try {
      model.startGame(deck, shuffle, numRows, numDraw);
    } catch (IllegalArgumentException e) {
      throw new IllegalStateException("The game cannot start with current state");
    }

    PyramidSolitaireView view = new PyramidSolitaireTextualView(model, this.ap);

    String command;
    int[] inputs = new int[4];
    boolean cont = false;

    try {
      view.render();
      ap.append("\n");
      ap.append("Score: " + model.getScore() + "\n");
      while (!model.isGameOver() && scan.hasNext()) {
        command = scan.next();
        switch (command) {
          case "rm1":
            cont = getInput(inputs, 2);
            if (!cont) {
              quitMessage(model);
              return;
            }
            try {
              model.remove(inputs[0] - 1, inputs[1] - 1);
            } catch (IllegalArgumentException e) {
              ap.append("Invalid Move. Play Again. " + e.getMessage() + "\n");
            }
            break;
          case "rm2":
            cont = getInput(inputs, 4);
            if (!cont) {
              quitMessage(model);
              return;
            }
            try {
              model.remove(inputs[0] - 1, inputs[1] - 1, inputs[2] - 1, inputs[3] - 1);
            } catch (IllegalArgumentException e) {
              ap.append("Invalid Move. Play Again. " + e.getMessage() + "\n");
            }
            break;
          case "rmwd":
            cont = getInput(inputs, 3);
            if (!cont) {
              quitMessage(model);
              return;
            }
            try {
              model.removeUsingDraw(inputs[0] - 1, inputs[1] - 1, inputs[2] - 1);
            } catch (IllegalArgumentException e) {
              ap.append("Invalid Move. Play Again. " + e.getMessage() + "\n");
            }
            break;
          case "dd":
            cont = getInput(inputs, 1);
            if (!cont) {
              quitMessage(model);
              return;
            }
            try {
              model.discardDraw(inputs[0] - 1);
            } catch (IllegalArgumentException e) {
              ap.append("Invalid Move. Play Again. " + e.getMessage() + "\n");
            }
            break;
          case "q":
          case "Q":
            quitMessage(model);
            return;
          default:
            ap.append("Put proper move \n");
        }
        if (model.isGameOver()) {
          break;
        }
        view.render();
        ap.append("\n");
        ap.append("Score: " + model.getScore() + "\n");

      }
      if (model.getScore() == 0) {
        ap.append("You win!");
      } else {
        ap.append("Game over. Score: " + model.getScore());
      }
    } catch (IOException e) {
      throw new IllegalStateException("Invalid input/output");
    }
  }
}