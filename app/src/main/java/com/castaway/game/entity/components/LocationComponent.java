package com.game.components;

public class LocationComponent {
  public String locationName;
  public boolean isNearWater;

  public LocationComponent(String locationName, boolean isNearWater) {
    this.locationName = locationName;
    this.isNearWater = isNearWater;
  }
}
