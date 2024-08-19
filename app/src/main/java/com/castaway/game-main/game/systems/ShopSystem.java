package com.castaway.game.system;

import java.util.Currency;

public class ShopSystem {

  public void processBuy(Entity player, String itemName) {
    CurrencyComponent currency = player.getComponent(CurrencyComponent.class);
    int price = getItemPrice(itemName);
    if (currency.currency >= price) {
      currency.currency -= price;
      System.out.printf("You bought %s for $%d", itemName, price);
    } else {
      System.out.printf("Not enough currency to buy %s.", itemName);
    }
  }

  public void processSell(Entity player, String itemName) {
    InventoryComponent inventory = player.getComponent(InventoryComponent.class);
    CurrencyComponent currency = player.getComponent(CurrencyComponent.class);
    int price = getItemPrice(itemName);

    // Assume player has the item and remove it from inventory
    // Add the sell price to the player's currency
    currency.currency += price;
    System.out.printf("You sold %s for $%d", itemName, price);
  }

  private int getItemPrice(String itemName) {
    // return the price of the item based on the name
    // This could be a lookup in a database or JSON file
    return 100; // place holder need to add the json file
  }
}
