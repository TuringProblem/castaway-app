package com.castaway.game.entity;

import java.util.UUID;

import com.castaway.game.entity.components.CurrencyComponent;
import com.castaway.game.entity.components.FishComponent;
import com.castaway.game.entity.components.InventoryComponent;
import com.castaway.game.entity.components.PositionComponent;
import com.castaway.game.entity.components.XPComponent;
import com.castaway.game.entity.components.fish.Card;

public class EntityFactory {
  public static Entity createFishEntity(String species, Rarity rarity) {
    Entity fish = new Entity();

    fish.addComponent(PositionComponent.class, new PositionComponent(0, 0));
    // fish.addComponent(Card.class, new Card(species, rarity,
    // calculateFishValue(rarity), "imageURL", 1, generateCardNumber()));
    return fish;
  }

  private static int calculateFishValue(Rarity rarity) {
    return switch (rarity) {
      // add the cases here
    };
  }

  private static String generateCardNumber() {
    return UUID.randomUUID().toString();
  }
}
