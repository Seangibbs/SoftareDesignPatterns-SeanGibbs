package decorator;

import factoryMethod.Appliance;

public class Headphones extends ApplianceDecorator {

    public Headphones(Appliance appliance) {
        super(appliance);
    }

    @Override
    public Appliance getApplianceName(int index) {
        return HeadphoneEnum.HEADPHONES;
    }

    @Override
    public String getTitle (){
        return appliance.getTitle() + " with " + HeadphoneEnum.values()[0].getTitle();
    }
}

