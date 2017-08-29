package iterator;


public class Item {

    private ItemType type;
    private String appliance;

    public Item(ItemType type, String appliance) {
        this.setType(type);
        this.appliance = appliance;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return appliance;
    }
}
