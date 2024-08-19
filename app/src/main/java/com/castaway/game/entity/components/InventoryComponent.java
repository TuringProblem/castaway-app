package com.castaway.game.entity.components;

import java.util.ArrayList;
import java.util.List;

public class InventoryComponent {

  private int maxCapacity;
  private List<Card> cards = new ArrayList<>();

  public InventoryComponent(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public int getMaxCapacity() {
    return maxCapacity;
  }

  public List<Card> getCards() {
    return cards;
  }

  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public void setCards(List<Card> cards) {
    this.cards = cards;
  }

}
