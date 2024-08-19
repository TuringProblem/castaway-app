package com.castaway.game.entity.components.fish;

import java.util.UUID;

public class Card {
  private final UUID id; // unique identifier for the card
  private String species;
  private Rarity rarity;
  private int value;
  private String imageURL;
  private int quantity; // if applicable, the number of these cards the player has (for non-unique
                        // cards)
  private String cardNumber; // cards are going to be serialized

  public Card(String species, Rarity rarity, int value, String imageURL,
      int quantity, String cardNumber) {
    this.species = species;
    this.rarity = rarity;
    this.value = value;
    this.imageURL = imageURL;
    this.quantity = quantity;
    this.cardNumber = cardNumber;
  }

  public UUID getId() {
    return id;
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

  public String getImageURL() {
    return imageURL;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getCardNumber() {
    return cardNumber;
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

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  /**
   * public String displayCardInfo() {
   * return String.format("**%S** (%s)\nRarity: %s\nValue: %d\nC")
   * still need to figure out what is going to be displayed on the card
   **/

}
