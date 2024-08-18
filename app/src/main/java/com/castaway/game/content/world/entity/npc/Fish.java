package com.castaway.game.content.world.entity.npc;

import com.castaway.game.content.world.entity.Entity;
import com.castaway.game.util.Types;

/**
 * @author @Override
 * @see <a href="https:/github.com/TuringProblem">Gihub Profile</a>
 * @since 08/13/2024
 **/

public abstract class Fish extends Entity {

  protected String species;
  protected Rarity rarity;
  protected Habitat habitat;
  protected Entity entity;
  protected boolean isCaught;

  public abstract String getDescription();

  public abstract void caughtFish();

  public Fish() {
    super();
    species = "Null";
    rarity = null;
    habitat = null;
  }

  public Fish(String name, int level) {
    super(name, level);
  }

  public Fish(String name, int level, int weight) {
    super(name, level, weight);
  }

  public Fish(String name, int level, String species, Rarity rarity, Habitat habitat) {
    super(name, level);
    this.species = species;
    this.rarity = rarity;
    this.habitat = habitat;

  }

  public enum Rarity {
    UNCOMMON("UNCOMMON", 0.02f, 0.01f),
    COMMON("COMMON", 0.05f, 0.05),
    RARE("RARE", 0.1f, 0.1f),
    LEGENDARY("LEGENDARY", 0.2f, 0.15f),
    CASTED("CASTED", 0.3f, 0.25f);

    private final String name;
    private final double xpMultiplier;
    private final double currencyMultiplier;

    Rarity(String name, double xpMultiplier, double currencyMultiplier) {
      this.name = name;
      this.xpMultiplier = xpMultiplier;
      this.currencyMultiplier = currencyMultiplier;
    }

    public String getName() {
      return name;
    }

    public double getXpMultiplier() {
      return xpMultiplier;
    }

    public double getCurrencyMultiplier() {
      return currencyMultiplier;
    }

  }

  // public double calculateCurrency(Fish fish, double weight) {
  // double myFish = fish.getName();
  // switch()
  // return + weight * rarity.getCurrencyMultiplier();
  // }

  public double calculateXpGain() {
    return level * rarity.getXpMultiplier();
  }

  @Override
  public String toString() {
    return "";
  }
}
