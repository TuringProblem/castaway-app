public enum Rarity {

  UNCOMMON(0.75, 0.8, 1.0, 50000),
  COMMON(),
  RARE(),
  LEGENDARY(),
  CASTER();

  private final double successRate;
  private final double catchRate;
  private final double xpMultiplier;
  private final int varientLimit;

  Rarity(double successRate, double catchRate, double xpMultiplier,
      int varientLimit) {
    this.successRate = successRate;
    this.catchRate = catchRate;
    this.xpMultiplier = xpMultiplier;
    this.varientLimit = varientLimit;
  }

  public double getSuccessRate() {
    return successRate;
  }

  public double getCatchRate() {
    return catchRate;
  }
  // public double
}
