package com.castaway.game.entity.components;

public class FishComponent {
  private String species;
  private Rarity rarity;
  private int value;
  private int quantity;

  public FishComponent(String species, Rarity rarity, int value, int quantity) {
    this.species = species;
    this.rarity = rarity;
    this.value = value;
    this.quantity = quantity;
  }

  public String getSpecies() {
    return species;
  }

  public Rarity getRarity() {
    return rarity;
  }

  public int getValue() {
    return value;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public void setRarity(Rarity rarity) {
    this.rarity = rarity;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}
