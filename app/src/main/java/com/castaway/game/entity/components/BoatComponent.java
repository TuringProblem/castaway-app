package com.game.components;

public class BoatComponent {
  public String boatName;
  public List<String> unlockedAreas;

  public BoatComponent(String boatName, List<String> unlockedAreas) {
    this.boatName = boatName;
    this.unlockedAreas = unlockedAreas;
  }
}

