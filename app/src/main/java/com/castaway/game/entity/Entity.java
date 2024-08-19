import java.util.HashMap;
import java.util.Map;

public class Entity {

  private final int id;
  private final Map<Class<?>, Object> components;
  public Entity(int id) { 
    this.id = id; 
    this.components = new HashMap<>();
  }
   public int getId() { return id; }

   public <T> void addComponent(Class<T> componentClass, T component) { components.put(componentClass, component); }

   public <T> T getComponent(Class<T> componentClass) {
     componentClass.cast(components.get(componentClass));
   }

   public <T> boolean hashComponent(Class<T> componentClass) { return components.containsKey(componentClass); }



}
