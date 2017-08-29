package decorator;

import factoryMethod.Appliance;


public abstract class ApplianceDecorator implements Appliance {

    protected Appliance appliance;

    protected ApplianceDecorator(Appliance appliance) {
        this.appliance = appliance;
    }
}
