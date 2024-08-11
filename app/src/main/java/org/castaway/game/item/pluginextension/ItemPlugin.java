import java.util.HashMap;
import java.util.Map;

/**
* @author @Override
* @since 08/11/2024 @12:19 
* @see https://Github.com/TuringProblem
**/

public abstract class ItemPlugin {

  @NonNull
  public static ItemPlugin getPlugin(final int id) {
    //return Utils.getOrDefault(
    return id; //TODO: need to fix this and create a Util
  }
  
  private final Map<String, OptionHandler> delegatedInventoryHandlers = new HashMap<>(3);
  public abstract void handle();

  public void bind(final String option, final OptionHandler handler) {
    verifyIfOptionExist(option);
    delegatedInventoryHandlers.put(option.toLowerCase(), handler); 
  }

  public void bind(final String option, final BasicOptionHandler handler) {
    verifyIfOptionExist(option);
    delegatedInventoryHandlers.put(option.toLowerCase(), handler);
  }

  private void verifyIfOptionExist(final String option) {
    int[] items = getItems();
  }
  
  public abstract int[] getItems();


  //TODO: need to add Player and Item files to make these interfaces to work

  @FunctionalInterface
  public interface BasicOptionHandler extends OptionHandler {
    void handle(final Player player, final Item item, int slotId);
  } 

  @FunctionalInterface
  public interface OptionHandler {
    void handle(final Player player, final Item item, Container container, int slotId);
  }


}

