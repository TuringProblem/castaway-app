package com.castaway.game.entity;

import com.castaway.game.entity.components.CurrencyComponent;
import com.castaway.game.entity.components.InventoryComponent;
import com.castaway.game.entity.components.PositionComponent;
import com.castaway.game.entity.components.XPComponent;

public class EntityFactory {
  public static Entity createPlayerEntity(String playerName) {
    Entity player = new Entity();

    player.addComponent(PositionComponent.class, new PositionComponent(0, 0));
    player.addComponent(InventoryComponent.class, new InventoryComponent(15));
    player.addComponent(XPComponent.class, new XPComponent(1, 300, player.get));
    player.addComponent(CurrencyComponent.class, new CurrencyComponent(100));

  }
}
