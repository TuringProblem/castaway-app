import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

Public class Types {

  public enum Rarity {
    UNCOMMON(0.6f, 1.5),
    COMMON(0.4f, 2),
    RARE(0.25f, 7.5),
    EPIC(0.13f, 10),
    LEGENDARY(0.04f, 15),
    EXOTIC(0.01f, 25),
    CASTAWAY(0.001f, 50);

    private final float catchRate;
    private final int multiplier;

    Rarity(float catchRate, int multiplier) { 
      this.catchRate = catchRate;
      this.multiplier = multiplier;
    }

    public float getCatchRate() { return catchRate; }
    public int getMultiplier() { return multiplier; }
  }

  public class Fish {
    private String name;
    private Rarity rarity;
    private int baseValue; 
    private float fishWeight;

    public Fish(){
      name = "null";
      rarity = null;
      baseValue = 0;
      fishWeight = 0;
    }

    public Fish(String name, Rarity rarity, int baseValue, float fishWeight) {
      this.name = name;
      this.rarity = rarity;
      this.baseValue = baseValue;
      this.fishWeight = fishWeight;
    }


    public int calculateValue() {
      return Math.round(baseValue * rarity.getMultiplier() * fishWeight);
    }

    public String getName() { return name; }
    public Rarity getRarity() { return rarity; }
    public int getBaseValue() { return baseValue; }
    public float getFishWeight() { return fishWeight; }
    public void setName(String name) { this.name = name; }
    public void setRarity(Rarity rarity) { this.rarity = rarity; }
    public void setBaseValue(int baseValue) { this.baseValue = baseValue; }
    public void setFishWeight(float fishWeight) { this.fishWeight = fishWeight; }
  }
  public class FishCard {
    private Fish fish;
    private int value;

    public FishCard(Fish fish) {
      this.fish = fish;
      this.value = fish.calculateValue();
    }

    public Fish getFish() { return fish; }
    public int getValue() { return value; }

  }

}
