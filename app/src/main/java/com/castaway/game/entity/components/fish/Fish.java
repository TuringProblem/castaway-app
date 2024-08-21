
package com.castaway.game.entity;

public class Fish{
  
  private String species;
  private double weight;
  private double length;
  private Rarity rarity;
  private String habitat;
  private double biteTime; //in seconds
  private double strength;
  private double value;
  private double catchRate;
  private String preferredBait;
  private double maxDepth; 
  private String seasons;
  private int xp;

  public Fish(String species, double weight, double length, Rarity rarity,
      String habitat, double biteTime, double strength, double value, 
      double catchRate, String preferredBait, double maxDepth, String seasons, int xp) {

    this.species = species;
    this.weight = weight;
    this.length = length;
    this.rarity = rarity;
    this.habitat = habitat;
    this.biteTime = biteTime;
    this.strength = strength;
    this.value = value;
    this.catchRate = catchRate;
    this.preferredBait = preferredBait;
    this.maxDepth = maxDepth;
    this.seasons = seasons;
    this.xp = xp;
  }
  

  public String getSpecies() { return species; }
  public double getWeight() { return weight; //randomly generated based on the average size of fish }
  public double getLength() { return length; }
  public Rarity getRarity() { return rarity; }
  public String getHabitat() { return habitat; }
  public double getBiteTime() { return biteTime; }
  public double getStrength() { return strength; }
  public double getValue() { return value; }
  public double getCatchRate() { return catchRate; }
  public String getPreferredBait() { return preferredBait; }
  public double getMaxDepth() { return maxDepth; }
  public String getSeason() { return seasons; }
  public int getXP() { return xp; }
  
  public void setSpecies() { this.species = species; }
  public void setWeight() { this.weight = weight; }
  public void setLength() { this.length = length; }
  public void setRarity() { this.rarity = rarity; }
  public void setHabitat() { this.habitat = habitat; }
  public void setBiteTime() { this.biteTime = biteTime; }
  public void setStrength() { this.strength = strength; }
  public void setValue() { this.value = value; }
  public void setCatchRate() { this.catchRate = catchRate; }
  public void setPreferredBait() { this.preferredBait = preferredBait; }
  public void setMaxDepth() { this.maxDepth = maxDepth; }
  public void setSeason() { this.seasons = seasons; }
  
}
