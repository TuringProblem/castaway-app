package com.game.componenets;
import java.util.ArrayList;

public class InventoryComponent {

  public int maxCapacity;
  public List<Card> cards = new ArrayList<>(); 

  public InventoryComponent(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }
}
