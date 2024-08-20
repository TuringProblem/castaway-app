package com.castaway.game.entity;

import com.castaway.game.entity.components.NameComponent;
import com.castaway.game.entity.components.PositionComponent;
import com.castaway.game.entity.components.XPComponent;
import com.castaway.game.entity.components.InventoryComponent;
import com.castaway.game.entity.components.CurrencyComponent;
import com.castaway.game.entity.components.fish.Card;

public class EntityBuilder {
  private Entity entity;

  public EntityBuilder() {
    this.entity = new Entity();
  }

  public EntityBuilder withName(String name) {
    entity.addComponent(NameComponent.class, new NameComponent(name));
    return this;
  }

  public EntityBuilder withPosition(float x, float y) {
    entity.addComponent(PositionComponent.class, new PositionComponent(0, 0));
    return this;
  }

  public EntityBuilder withInventory(int capacity) {
    entity.addComponent(InventoryComponent.class, new InventoryComponent(capacity));
    return this;
  }

  public EntityBuilder withXP(int level, int xp, int tillNextLevel) {
    entity.addComponent(XPComponent.class, new XPComponent(level, xp, tillNextLevel));
    return this;
  }

  public EntityBuilder withCurrency(int currency) {
    entity.addComponent(CurrencyComponent.class, new CurrencyComponent(currency));
    return this;
  }

  public EntityBuilder withFishDetails(String species, Rarity rarity,
      int value, String imageURL, int quantity, String cardNumber) {
    entity.addComponent(Card.class, new Card(species, rarity, value, imageURL, quantity, cardNumber));
    return this;
  }

  public Entity build() {
    return entity;
  }

}
