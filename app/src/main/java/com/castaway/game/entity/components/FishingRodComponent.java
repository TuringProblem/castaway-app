package com.castaway.game.entity.components;

public class FishingRodComponent {

  private String rodName;
  private int effectiveness;
  private double xpMultiplier;

  public FishingRodComponent(String rodName, int effectiveness, double xpMultiplier) {
    this.rodName = rodName;
    this.effectiveness = effectiveness;
    this.xpMultiplier = xpMultiplier;
  }

  public String getRodName() {
    return rodName;
  }

  public int getEffectiveness() {
    return effectiveness;
  }

  public double getXpMultiplier() {
    return xpMultiplier;
  }

  public void setRodName(String rodName) {
    this.rodName = rodName;
  }

  public void setEffectiveness(int effectiveness) {
    this.effectiveness = effectiveness;
  }

  public void setXpMultiplier(double xpMultiplier) {
    this.xpMultiplier = xpMultiplier;
  }

}
