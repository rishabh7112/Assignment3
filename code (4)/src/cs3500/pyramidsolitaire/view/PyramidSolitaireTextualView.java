package cs3500.pyramidsolitaire.view;

import cs3500.pyramidsolitaire.model.hw02.PyramidSolitaireModel;
import java.io.IOException;

/**
 * represents the view for the game and renders the solitaire game.
 */
public class PyramidSolitaireTextualView implements PyramidSolitaireView {

  private final PyramidSolitaireModel<?> model;
  private Appendable ap;
  // ... any other fields you need

  /**
   * represents 2 argument constructor for the view.
   *
   * @param model represents the model for the pryamid solitaire game
   * @param ap    represents the Appendable which outputs from controller
   */

  public PyramidSolitaireTextualView(PyramidSolitaireModel<?> model, Appendable ap) {
    this.model = model;
    this.ap = ap;
  }

  /**
   * represents 1 argument constructor for the view.
   *
   * @param model represents the model for the pryamid solitaire game
   */
  public PyramidSolitaireTextualView(PyramidSolitaireModel<?> model) {
    this.model = model;
  }

  // produces the toString() of the game
  @Override
  public String toString() {
    //1. Check if game hasn't started yet
    if (model.getNumRows() == -1) {
      return "";
    }
    //2. Check if the player won the game (pyramid is emptied)
    if (model.getScore() == 0) {
      return "You win!";
    }
    //3. Check if game is over
    if (model.isGameOver()) {
      return "Game over. Score: " + model.getScore();
    }
    //4. Otherwise, return a String representing the pyramid
    String str = "";
    for (int i = 0; i < model.getNumRows(); i++) {
      String row = "";
      for (int j = 0; j < model.getRowWidth(i); j++) {
        Object card = model.getCardAt(i, j);
        if (card != null) {
          row += String.format("%-4s", card.toString());
        } else {
          row += ".   ";
        }
      }
      row = row.trim();
      int whites = 2 * (model.getNumRows() - 1 - i);
      if (whites > 0) {
        str += String.format("%" + whites + "s", "");
      }
      str += row + "\n";
    }
    str += "Draw: ";
    for (int i = 0; i < model.getNumDraw() && i < model.getDrawCards().size(); i++) {
      str += model.getDrawCards().get(i);
      if (i < model.getNumDraw() - 1 && i < model.getDrawCards().size() - 1) {
        str += ", ";
      }
    }
    return str;
  }

  /**
   * Renders a model in some manner (e.g. as text, or as graphics, etc.).
   *
   * @throws IOException if the rendering fails for some reason
   */
  @Override
  public void render() throws IOException {
    this.ap.append(this.toString());
  }
}

