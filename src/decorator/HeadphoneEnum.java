package decorator;

import factoryMethod.Appliance;


public enum HeadphoneEnum implements Appliance {

    HEADPHONES("Beats Headphones");

    private final String title;

    HeadphoneEnum(String title) {
        this.title = title;
    }

    @Override
    public Appliance getApplianceName(int index){
        return HeadphoneEnum.values()[index];
    }

    @Override
    public String getTitle (){
        return title;
    }
}
