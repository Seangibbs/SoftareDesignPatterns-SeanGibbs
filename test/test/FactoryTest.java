package test;

import Alone_factory_method.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class FactoryTest {

    @Test
    public void vwGarageWithEngine() {
        EngineManufacturer manufacturer = new VolkswagenGarage();
        Engine engine = manufacturer.buildEngine(EngineType.STOCK_ENGINE);
        assertEquals(EngineType.STOCK_ENGINE, engine.getEngineType());
    }

}
