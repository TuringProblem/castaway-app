//still need to add the imports
//
/**
 * @author @Override
 * @since 08/11/2024 @03:18
 * @see <a href="https://github.com/TuringProblem">Github Profile</a>
 **/

public interface Definitions {

  static void loadDefinitions(final Class<?>[] definitions) {
    for (Class<?> clazz : definitions) {
      try {
        Object instance = clazz.getDeclaredConstructor().newInstance();
        if (instance instanceof Definitions) {
          ((Definitions) instance).load();
        }
      } catch (final Exception e) {
        System.out.println(e.getMessage()); // TODO: need to make sure this is changed to
                                            // GameEngine.logger.error(Strings.EMPTY, e);
      }
    }
  }

  static Runnable load(final Class<?> clazz) {
    return () -> {
      try {
        Object instance = clazz.getDeclaredConstructor().newInstance();
        if (instance instanceof Definitions) {
          ((Definitions) instance).load();
        }
      } catch (final Exception e) {
        System.out.println(e.getMessage());
      }
    };
  }

  void load();

  default void decode(final ByteBuffer buffer) {
  }

  default void decode(final ByteBuffer buffer, final int opcode) {
  }

  default ByteBuffer encode() {
    return null;
  }

  default void pack() {
  }
}
