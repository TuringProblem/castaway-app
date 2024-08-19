import com.castaway.game.entity.components.InventoryComponent;
import com.castaway.game.entity.components.XPComponent;
import com.castaway.game.entity.components.CurrencyComponent;
import com.castaway.game.entity.components.LocationComponent;
import com.castaway.game.entity.components.FishingRodComponent;
import com.castaway.game.entity.components.BaitComponent;
import com.castaway.game.entity.components.BoatComponent;
import com.castaway.game.entity.Entity;

public class Player extends Entity {
  public Player(int id) {
    super(id);

    // initialize the player with default components
    this.addComponent(InventoryComponent.class, new InventoryComponent(15));
    this.addComponent(XPComponent.class, new XPComponent(1, 0, 100));
    this.addComponent(CurrencyComponent.class, new CurrencyComponent(100));
    this.addComponent(LocationComponent.class, new LocationComponent("Home", false));
    this.addComponent(FishingRodComponent.class, new FishingRodComponent("Beginner rod", 10, 1.0));
    this.addComponent(BaitComponent.class, new BaitComponent("Basic Bait", 5));
    this.addComponent(BoatComponent.class, new BoatComponent("None", List.of("Shore"))); // starting with no boat

  }

}
