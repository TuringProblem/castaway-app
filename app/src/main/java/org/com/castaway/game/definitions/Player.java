  /*
   * @author @Override
   * @since 08/13/2024
   * @see <a href="https://github.com/TuringProblem">Github Profile</a>
   **/

  public class Player {
    private String id;
    private String username;
    private int fishingLevel;
    private int experience;
    private int currency;
    private List<FishCard> fishCards; //Collection of fish cards the player owns

    public Player(String id, String username) {
      this.id = id;
      this.username = username;
      this.fishingLevel = 1;
      this.experience = 0;
      this.currency = 1000;
    }
    
    public String getId() { return id; }
    public String getUsername() { return username; }
    public int getFishingLevel() { return fishingLevel; }
    public int getExperience() { return experience; }
    public int getCurrecy() { return currency; }
    public void setId(String id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setFishingLevel(int fishingLevel) { this.fishingLevel = fishingLevel; }
    public void setExperience(int experience) { this.experience = experience; }
    public void setCurrency(int currency) { this.currency = currency; }

    
  }
