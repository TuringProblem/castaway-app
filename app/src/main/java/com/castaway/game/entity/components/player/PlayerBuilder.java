package com.castaway.game.entity.components.player;

public class PlayerBuilder {
  private String playerName;
  private int initialInventoryCapacity = 15;
  private int initialCurrency = 100;
  private int initialLevel = 1;
  private int initialXP = 0;

  public PlayerBuilder withName(String PlayerName) {
    this.playerName = playerName;
    return this;
  }

  public PlayerBuilder withInventoryCapacity(int capacity) {
    this.initialInventoryCapacity = capacity;
    return this;
  }
  
}
