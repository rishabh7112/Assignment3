package cs3500.pyramidsolitaire.model.hw04;

import cs3500.pyramidsolitaire.model.hw02.BasicPyramidSolitaire;
import cs3500.pyramidsolitaire.model.hw02.Card;
import java.util.List;

/**
 * represents the relaxed pyramid model where the rules are "relaxed".
 */
public class RelaxedPyramidSolitaireModel extends BasicPyramidSolitaire {

  public RelaxedPyramidSolitaireModel() {
    super();
  }

  /**
   * this remove method gives you the ability to remove 2 cards where 1 card is covered by only 1
   * card and they add up to 13.
   *
   * @param row1  row of first card position, numbered from 0 from the top of the pyramid
   * @param card1 card of first card position, numbered from 0 from left
   * @param row2  row of second card position
   * @param card2 card of second card position
   * @throws IllegalArgumentException if the removal for requested cards is not possible
   * @throws IllegalStateException    if the game hasn't started yet
   */
  public void remove(int row1, int card1, int row2, int card2)
      throws IllegalArgumentException, IllegalStateException {
    //Check state of game
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    //Check for valid removal
    boolean valid = false;
    if (row1 >= 0 && row1 < numRows && card1 >= 0 && card1 <= row1
        && row2 >= 0 && row2 < numRows && card2 >= 0 && card2 <= row2) {
      //Check front cards to be removed
      //Check card 1 valid
      if (((row1 == numRows - 1) || ((pyramid.get(row1 + 1).get(card1) == null ||
          (row1 + 1 == row2 && card1 == card2 && pyramid.get(row1 + 1).get(card1 + 1) == null))
          && (pyramid.get(row1 + 1).get(card1 + 1) == null ||
          (row1 + 1 == row2 && card1 + 1 == card2 && pyramid.get(row1 + 1).get(card1) == null))))
          && ((row2 == numRows - 1) || ((pyramid.get(row2 + 1).get(card2) == null ||
          (row2 + 1 == row1 && card1 == card2 && pyramid.get(row2 + 1).get(card2 + 1) == null))
          && (pyramid.get(row2 + 1).get(card2 + 1) == null ||
          (row2 + 1 == row2 && card2 + 1 == card1 && pyramid.get(row2 + 1).get(card2) == null))))) {
        valid = true;
      }
    }
    if (valid && pyramid.get(row1).get(card1) != null &&
        pyramid.get(row2).get(card2) != null &&
        pyramid.get(row1).get(card1).getRank().value() +
            pyramid.get(row2).get(card2).getRank().value() == 13) {
      pyramid.get(row1).set(card1, null);
      pyramid.get(row2).set(card2, null);
    } else {
      throw new IllegalArgumentException("Removal for requested cards is not possible");
    }
  }

  /**
   * Goes through all the available cards as well as the "relaxed" cards to see if the game is
   * over.
   *
   * @return true if the game is over
   * @throws IllegalStateException if the game hasn't started
   */
  @Override
  public boolean isGameOver() throws IllegalStateException {
    if (pyramid.size() == 0) {
      throw new IllegalStateException("Game has not started yet");
    }
    if (getScore() == 0) {
      //Player won!
      return true;
    }
    if (numDraw < drawCards.size()) {
      return false;
    }
    //Check all visible cards!
    List<Card> availableCards = getAvailableCards();
    for (int i = 0; i < availableCards.size(); i++) {
      if (availableCards.get(i).getRank().value() == 13) {
        return false;
      }
      for (int j = i + 1; j < availableCards.size(); j++) {
        if (availableCards.get(i).getRank().value() +
            availableCards.get(j).getRank().value() == 13) {
          return false;
        }
      }
    }
    //Check possible cards to be relaxed
    for (int i = 0; i < numRows - 1; i++) {
      for (int j = 0; j <= i; j++) {
        if (pyramid.get(i).get(j) != null) {
          if ((pyramid.get(i + 1).get(j) != null &&
              pyramid.get(i + 1).get(j + 1) == null &&
              availableCards.contains(pyramid.get(i + 1).get(j))
              && pyramid.get(i).get(j).getRank().value() +
              pyramid.get(i + 1).get(j).getRank().value() == 13) ||
              (pyramid.get(i + 1).get(j + 1) != null &&
                  pyramid.get(i + 1).get(j) == null &&
                  availableCards.contains(pyramid.get(i + 1).get(j + 1))
                  && pyramid.get(i).get(j).getRank().value() +
                  pyramid.get(i + 1).get(j + 1).getRank().value() == 13)) {
            return false;
          }
        }
      }
    }
    return true;
  }
}



