package decorator;

import factoryMethod.Appliance;


public class Audio extends ApplianceDecorator {

    public Audio(Appliance appliance) {
        super(appliance);
    }

    @Override
    public Appliance getApplianceName(int index) {
        return AudioEnum.SPEAKERS;
    }

    @Override
    public String getTitle (){
        return appliance.getTitle() + " with " + AudioEnum.values()[0].getTitle();
    }
}
