package com.castaway.game.entity.components.player;

import com.castaway.game.entity.Entity;
import com.castaway.game.entity.components.InventoryComponent;
import com.castaway.game.entity.components.PositionComponent;
import com.castaway.game.entity.components.XPComponent;
import com.castaway.game.entity.components.CurrencyComponent;

public class PlayerBuilder {
  private String playerName;
  private int initialInventoryCapacity = 15;
  private int initialCurrency = 100;
  private int initialLevel = 1;
  private int initialXP = 0;

  public PlayerBuilder withName(String fileLocation) { // using .toml or .json files
    this.playerName = fileLocation;
    return this;
  }

  public PlayerBuilder withInventoryCapacity(int capacity) {
    this.initialInventoryCapacity = capacity;
    return this;
  }

  public PlayerBuilder withInitialCurrency(int currency) {
    this.initialCurrency = currency;
    return this;
  }

  public PlayerBuilder withInitialLevel(int level) {
    this.initialLevel = level;
    return this;
  }

  public PlayerBuilder withInitialXP(int xp) {
    this.initialXP = xp;
    return this;
  }

  public Entity build() {
    Entity player = new Entity();
    // player.addComponent(nameComponent.class, component);
    player.addComponent(PositionComponent.class, new PositionComponent(0, 0));
    player.addComponent(InventoryComponent.class, new InventoryComponent(initialInventoryCapacity));
    player.addComponent(XPComponent.class, new XPComponent(initialLevel, initialXP));
    player.addComponent(CurrencyComponent.class, new CurrencyComponent(initialCurrency));
    return player;
  }
}
