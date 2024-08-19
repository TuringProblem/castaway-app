package com.castaway.game.entity.components;

public class LocationComponent {
  private String locationName;
  private boolean isNearWater;

  public LocationComponent(String locationName, boolean isNearWater) {
    this.locationName = locationName;
    this.isNearWater = isNearWater;
  }

  public String getLoctaionName() {
    return locationName;
  }

  public boolean getIsNearWater() {
    return isNearWater;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public void setIsNearWater(boolean isNearWater) {
    this.isNearWater = isNearWater;
  }

}
