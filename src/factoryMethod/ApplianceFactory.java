package factoryMethod;

import iterator.ItemType;


public interface ApplianceFactory {

    Appliance[] buildAppliances(ItemType type);
    Appliance buildAppliance(Appliance type);
}
