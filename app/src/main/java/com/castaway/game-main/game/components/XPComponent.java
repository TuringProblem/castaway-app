package com.game.components;

public class XPComponent {
  public int level;
  public int experiencePoints;
  public int experienceToNextLevel;

  public XPComponent(int level, int experiencePoints, int experienceToNextLevel) {
    this.level = level;
    this.experiencePoints = experiencePoints;
    this.experienceToNextLevel = experienceToNextLevel;
  }
}
