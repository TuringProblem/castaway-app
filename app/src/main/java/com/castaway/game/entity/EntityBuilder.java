
public class EntityBuilder {
  private Entity entity;

  public EntityBuilder() { this.entity = new Entity(); }

  public EntityBuilder withName(String name) {
    entity.addComponent(NameComponent.class, new NameComponent(name));
    return this;
  }
  public EntityBuilder withPosition(float x, float y) {
    entity.addComponent();
  }

}
