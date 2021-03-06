package decorator;

import factoryMethod.Appliance;


public enum ChargerEnum implements Appliance {

    CHARGER_CASE("Charging Case");

    private final String title;

    ChargerEnum(String title) {
        this.title = title;
    }

    @Override
    public Appliance getApplianceName(int index){
        return ChargerEnum.values()[index];
    }

    @Override
    public String getTitle (){
        return title;
    }
}
