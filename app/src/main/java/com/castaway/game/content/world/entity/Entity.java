package com.castaway.game.content.world.entity;

public abstract class Entity {
  // TODO: #1 Psylochological features: -> IE:living organism(mental, emotional
  // life), how beings think, feel, and behave(happy/mad)

  // TODO: #2 Attributes: Characteristic or qualities that help describe an
  // entity. Person has (Height, eye color, or personality traits like kindness
  // ON a broader scale attributes like non-living things are applicable as well
  // (the brightness of a star, reliability of a car) (qualities rather than
  // physical objects themselves
  protected String name;
  protected int level;
  protected int weight;

  public Entity() {
    name = "null";
    level = 0;
  }

  public Entity(String name, int level) {
    this.name = name;
    this.level = level;
  }

  // might not need this format (name, level, weight);

  public Entity(String name, int level, int weight) {
    this.name = name;
    this.level = level;
    this.weight = weight;
  }

  public abstract String getDescription();

  public abstract double calculateValue();

  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  // TODO: #3 Amount, Measure, Quantity: Referring to the concept of counting or
  // measuring how much there is of something.
  // These are abstract because they deal with number or the idea of quanitity
  // rather than the actual items being count/measured
  // IE: ("Three apples") -> "Three" is abstract quantity that tells us how many
  // apples there are.
  // Measuring time, distance, weight, or temperature involves abstract entities
  // because they represent a standard to quantify aspects of the physicla world.

  // TODO: #4 Motivation: Psychological feature that drives agnism to act in a
  // certain way, often toward achieving a specific goal
  // Motivation is crucial for intiating and sustaining actions.
  // IE:
  // Hunger -> might motivate an animal to search for food;
  // Ambition -> might drive a person to work hard in their career.
  public transient int index;

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  // public transient Location lastLocation;
  // public transient Location nextLocation;

  // TODO: public void setLocation(final Location location) {
  // if (location == null) {
  // return;
  // }
  // nextLocation = new Location(location);
  // }

}
