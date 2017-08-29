package test;

import decorator.Charger;
import decorator.Headphones;
import factoryMethod.Appliance;
import factoryMethod.ApplianceFactory;
import factoryMethod.ElectronicAppliance;
import factoryMethod.LocalFactory;
import org.junit.Assert;
import org.junit.Test;


public class DecoratorTest {

    @Test
    public void TestGunDecorator() {

        ApplianceFactory applianceFactory = new LocalFactory();
        Appliance smartPhone = applianceFactory.buildAppliance(ElectronicAppliance.SMART_PHONE);
        Assert.assertEquals("Apple Phone", smartPhone.getTitle());

        Appliance phoneWithGadgets = new Charger(new Headphones(smartPhone));
        Assert.assertEquals("Apple Phone with Beats Headphones with Charging Case", phoneWithGadgets.getTitle());

        Assert.assertEquals(smartPhone.getTitle(), phoneWithGadgets.getTitle()); // failed
    }

}
