package mgi.types.config.items;

/**
 * @author @Override
 * @since 08/11/2024 @ 04:05
 * @see <a href="https://github.com/TuringProblem">Github</a>
 **/

public class JsonItemDefinitions {

  private int id;
  private Integer basePrice;
  private Boolean tradeable;
  private Integer weight;// might not need this

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setBasePrice(Integer basePrice) {
    this.basePrice = basePrice;
  }

  public Integer getBasePrice() {
    return basePrice;
  }

  public void isTradable(boolean tradeable) {
    this.tradable = tradable;
  }

  public Boolean getTradable() {
    return tradeable;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Integer getWeight() {
    return weight;
  }

}
