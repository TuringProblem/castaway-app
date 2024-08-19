//package com.castaway.game;

import discord4j.core.event.domain.interaction.SlashCommandEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.channel.MessageChannel;
import reactor.core.publisher.Mono;
import com.game.componenets.InventoryComponent;

public class InventorySystem {

  public Mono<void> displayInventory(Entity player, SlashCommandEvent event) {
    InventoryComponent inventory = player.getComponent(InventoryComponent.class);
    StringBuilder inventoryMessage = new StringBuilder("Your Inventory:/n");
    for (FishComponent fish : inventory.cards) {
      inventoryMessage.append(fish.species).append(" - ").append(fish.rarity).append(" - ").append(fish.value).append(" currency\n");
    }
    return event.reply(inventoryMessage.toString());
  }
}
