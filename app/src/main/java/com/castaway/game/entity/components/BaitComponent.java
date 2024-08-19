package com.castaway.game.entity.components;

public class BaitComponent {
  private String baitName;
  private int effectiveness;

  public BaitComponent(String baitName, int effectiveness) {
    this.baitName = baitName;
    this.effectiveness = effectiveness;
  }

  public String getBaitName() {
    return baitName;
  }

  public int getEffectiveness() {
    return effectiveness;
  }

  public void setBaitName(String baitName) {
    this.baitName = baitName;
  }

  public void setEffectiveness(int effectiveness) {
    this.effectiveness = effectiveness;
  }

}
