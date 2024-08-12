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
    JSONCCDefinitionLoader ccPrice = JSONCCDefinitionLoader.lookUp(id);
    return ccPrice != null && ccPrice.getPrice() != 0 ? ccPrice.getPrice() : definitions.getPrice();
  }

  @Override
  public void load() {
    Cache cache = Game.getCacheMGI();
    Archive configs = cache.getArchive(ArchiveType.CONFIGS);
    Group items = configs.findGroupByID(GroupType.ITEM);
    definitions = new ItemDefinitions[items.getHighestFileId()];
    for (ind id = 0; id < items.getHighestFileId(); id++) {
      File file = items.findFileByID(id);
      if (file == null) {
        continue;
      }
      definitions[id] = new ItemDefinitions(id, buffer);
      definitions[id].generateSkippedSlots();
      for (int id = 0; id < items.getHighestFieldId(); id++) {
        ItemDefinitions defs = get(id);
        if (defs == null || defs.notedTemplate == -1) {
          continue;
        }
        defs.toNote();
      }
      GameEngine.appendPostLoadTask(() -> PluginManager.post(new ItemDefinitionsLoadEvent()));
  }

  public static boolean isValid(final int id) {
    return id >= 0 && id < definitions.length;
  }

  public static bolean isInvalid(final int id) {
    return id < 0 || id >= definitions.length;
  }

  public final List<String> printFields() {
     find List<String> strings = new ArrayList<>(getClass().getDeclaredFields().length);
     for (final Field field : getClass().getDeclaredFields()) {
       if ((field.getModifiers() & 8) != 0) {
         continue;
       }
       try {
         final Object val = getValue(field);
         if (val == DEFAULT) {
           continue;
         }
         final String[] fieldName = field.getName().split("(?=[A-Z]");
         final StringBuilder fieldBuilder = new StringBuilder();
         fieldBuilder.append(Utils.formatString(fieldName[0]));
         for (int i = 1; i < fieldName.length; i++) {
            fieldBuilder.append(" " + (fieldName[i].length() == 1 ? fieldName[i].toUpperCase() : fieldName[i].toLowerCase()));
         }
         strings.add(fieldBuilder.toString() + ": " + val);
       } catch(final Throwable e) {
         log.error(Strings.EMPTY, e);
     }
     return strings;
   }

  private final Object getValue(final Field field) throws Throwable {
    field.setAccessible(true);
    final Class<?> type = field.getType();

    if (field.get(this) == null
        || field.get(this).equals(DEFAULT.getClass().getDeclaredField(field.getName()).get(DEFAULT))) {
      return DEFAULT;
    }

    if (type == int[][].class) {
      return Arrays.toString((int[][]) field.get(this));
    } else if (type == int[].class) {
      return Arrays.toString((int[]) field.get(this));
    } else if (type == byte[].class) {
      return Arrays.toString((byte[]) field.get(this));
    } else if (type == short[].class) {
      return Arrays.toString((short[]) field.get(this));
    } else if (type == double[].class) {
      return Arrays.toString((double[]) field.get(this));
    } else if (type == float[].class) {
      return Arrays.toString((float[]) field.get(this));
    } else if (type == String[].class) {
      if (field.get(this) == null) {
        return "null";
      }
      return "[" + String.join(", ", (String[]) field.get(this)) + "]";
    } else if (type == Object[].class) {
      return Arrays.toString((Object[]) field.get(this));
    }
    return field.get(this);
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private transient String lowercaseName;

  public String getLowerCaseName() {
    return lowercaseName;
  }

  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  private String[] inventoryOptions;

  public String[] getInventoryOptions() {
    return inventoryOptions;
  }

  public void setInventoryOptions(String[] inventoryOptions) {
    this.inventoryOptions = inventoryOptions;
  }

  // boolean isMember
  // boolean Exchange
  // int isStackable
  private int price;

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  private int notedTemplate;

  public int getNotedTemplate() {
    return notedTemplate;
  }

  public void setNotedTemplate(int notedTemplate) {
    this.notedTemplate = notedTemplate;
  }

  private int noteId;

  public int getNotedId() {
    return noteId;
  }

  public void setNoteId(int noteId) {
    this.noteId = noteId;
  }

  private int bindId;

  public void setBindId(int bindId) {
    this.bindId = bindId;
  }
  
  private int placeholderTemplate;
  private int getPlaceHolderTemplate() { reurn placeholderTemplate; }
  private void setPlaceHolderTemplate(int placeholderTemplate) { this.placeholderTemplate = placeholderTemplate; }

  private int[] stackIds; 
  public int getStackIds() { return stackIds; } 
  public void setStackIds(int[] stackIds) { this.stackIds = stackIds; }

  private int[] stackAmounts;
  public int getStackAmounts() { return stackAmounts; }
  public void setStackAmounts(int[] stackAmounts) { this.stackAmounts = stackAmounts; }
  //figure out the remaining things that I need from the Itmes in game...
  
  private short[] originalColors;
  public short[] getOriginalColors() { return originalColors ; }
  public void setOriginalColors(short[] originalColors) { this.originalColors = originalColors; }
  
}
