package com.castaway.game.content.world.area.location;

public class Location {

  protected int hash;

  public Location(int x, int y) {
    hash = x | y << 16;
  }

  public int getX() {
    return (hash >> 14) & 0x3FFF;
  }

  public int getY() {
    return hash & 0x3FFF;
  }

  @Override
  public String toString() {
    return "";
  }

}
