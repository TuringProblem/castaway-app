package com.castaway.game.entity.components;

public class XPComponent {

  private int level;
  private int experiencePoints;
  private int experienceToNextLevel;

  public XPComponent() {
    level = 0;
    experiencePoints = 0;
    experienceToNextLevel = 0;
  }

  public XPComponent(int level, int experiencePoints) {
    this.level = level;
    this.experiencePoints = experiencePoints;
  }

  public XPComponent(int level, int experiencePoints, int experienceToNextLevel) {
    this.level = level;
    this.experiencePoints = experiencePoints;
    this.experienceToNextLevel = experienceToNextLevel;
  }

  public int getLevel() {
    return level;
  }

  public int getExperiencePoints() {
    return experiencePoints;
  }

  public int getExperienceToNextLevel() {
    return experienceToNextLevel;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setExperiencePoints(int experiencePoints) {
    this.experiencePoints = experiencePoints;
  }

  public void setExperienceToNextLevel(int experienceToNextLevel) {
    this.experienceToNextLevel = experienceToNextLevel;
  }
}
