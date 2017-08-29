package decorator;

import factoryMethod.Appliance;


public enum AudioEnum implements Appliance {

    SPEAKERS("External Speakers");

    private final String title;

    AudioEnum(String title) {
        this.title = title;
    }

    @Override
    public Appliance getApplianceName(int index) {
        return HeadphoneEnum.values()[index];
    }

    @Override
    public String getTitle() {
        return title;
    }
}
