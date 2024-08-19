package com.game.components;

public class FishComponent {
  public String species;
  public Rarity rarity;
  public int value;
  public int quantity;

  public FishComponent(String species, Rarity rarity, int value, int quantity) {
    this.species = species;
    this.rarity = rarity;
    this.value = value;
    this.quantity = quantity;
  }
}
