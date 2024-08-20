package com.castaway.game.entity;

import java.util.UUID;

import com.castaway.game.entity.components.CurrencyComponent;
import com.castaway.game.entity.components.FishComponent;
import com.castaway.game.entity.components.InventoryComponent;
import com.castaway.game.entity.components.PositionComponent;
import com.castaway.game.entity.components.XPComponent;
import com.castaway.game.entity.components.fish.Card;

public class EntityFactory {
  public static Entity createPlayerEntity(String playerName, int initialCurrency,
      int initialLevel, int initialXp, int inventoryCapacity) {
    return new EntityBuilder().withName(playerName).withPosition(0, 0).withInventory(inventoryCapacity)
        .withXP(initialLevel, initialXp /* add the algorithm to calculate when the next level is */)
        .withCurrency(initialCurrency).build();

  }

  public static Entity createFishEntity(String species, Rarity rarity) {
    return new EntityBuilder().withPosition(0, 0).withFishDetails(species, rarity, calculateFishValue(rairty),
        "add the imageURL here this will be the json file", 1, generateCardNumber()).build();
  }

  private static int calculateFishValue(Rarity rarity) {
    return switch(rarity) {

      default -> ;
    }
  }

}
