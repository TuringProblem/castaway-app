package com.castaway.game.entity.components;

import java.util.List;

public class BoatComponent {
  private String boatName;
  private List<String> unlockedAreas;

  public BoatComponent(String boatName, List<String> unlockedAreas) {
    this.boatName = boatName;
    this.unlockedAreas = unlockedAreas;
  }

  public String getBoatName() {
    return boatName;
  }

  public List<String> getUnlockedAreas() {
    return unlockedAreas;
  }

  public void setBoatName(String boatName) {
    this.boatName = boatName;
  }

  public void setUnlockedAreas(List<String> unlockedAreas) {
    this.unlockedAreas = unlockedAreas;
  }
}
