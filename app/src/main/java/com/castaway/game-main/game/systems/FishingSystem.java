package com.game.systems;

import com.castaway.game.util.Types.Rarity;

public class FishingSystem {
  public void process(Entity player) {
    if (player.hasComponent(LocationComponent.class) && player.hasComponent(FishingRodComponent.class)
        && player.hasComponent(BaitComponent.class)) {
      if (!location.isNearWater) {
        System.out.println("You cannot fish here/n");
        return;
      }
      FishingRodComponent rod = player.getComponent(FishingRodComponent.class);
      BaitComponent bait = player.getComponent(BaitComponent.class);
      // calculate catch chance
      int catchChance = rod.effectiveness + bait.effectiveness;
      ;
      boolean caughtFish = (Math.random() * 100) < catchChance;
      if (caughtFish) {
        FishComponent fish = catchFish();
        player.getComponent(InventoryComponent.class).cards.add(fish);
        player.getComponent(XPComponent.class).experiencePoints += fish.rarity.getXpMultiplier() * 10;
        System.out.println("You caught a fish" + fish.species + "!");
      } else {
        System.out.println("No fish caught this time./ntry again! Hopefully you'll get lucky/n");
      }
    }
  }

  private FishComponent catchFish() {
    return new FishComponent("Salmon", Rarity.RARE, 100, 1);
  }
}
