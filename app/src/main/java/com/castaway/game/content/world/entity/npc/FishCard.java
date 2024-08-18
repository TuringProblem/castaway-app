package com.castaway.game.content.world.entity.npc;

import com.castaway.game.content.world.entity.npc.*;

/**
 * @author @Override
 * @see <a href="https:/github.com/TuringProblem">Gihub Profile</a>
 * @since 08/13/2024
 **/

public class FishCard extends Fish {
  public FishCard() {
    super();
  }

  public FishCard(String name, int level) {
    super(name, level);
  }

  public FishCard(String name, int level, int weight) {
    super(name, level, weight);
  }

  // this is where I'm going to add the weight ( for display -> I will do the math
  // for once the Player.java(catches the fish))

  // this is going to display what is going to be (Make a JSON FILE WITH ALL OF
  // THE INFORMATION REGARDING THE DESCRIPTION)``

  @Override
  public String getDescription() {
    return "null";
  }

  @Override
  public double calculateValue() {
    return 0;
  }

  @Override
  public void caughtFish() {
    /**
     * @author @Override
     * @see <a href="https:/github.com/TuringProblem">Gihub Profile</a>
     * @since 08/13/2024
     *        /**
     * @author @Override
     * @see <a href="https:/github.com/TuringProblem">Gihub Profile</a>
     * @since 08/13/2024
     **/
  }

  // public void diplayCard() -> show the value of the card.

  public void displayCard() {
    if (isCaught) {
      getDescription();
    }
  }

  // Predicate<

}
