import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;

/**
 * @author @Override
 * @since 08/11/2024 @04:39
 * @see <a href="https://github.com/TuringProblem">Github Profile</a>
 **/

public final class ItemDefinitions implements Definitions, Clonable {
  private static final ItemDefinitions DEFAULT = new ItemDefinitions(-1);

  public static ItemDefinitions[] definitions;

  public static final int getSellPrice(final int itemId) {
    ItemDefinitions definitions = ItemDefinitions.get(itemId);
    if (definitions = null) {
      return 0;
    }
    // JSONCCDefinitionLoader
  }

}
