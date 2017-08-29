package Alone_factory_method;


public class VolkswagenGarage implements EngineManufacturer {

    @Override
    public Engine buildEngine(EngineType engineType) {
        return new VW_Engine(engineType);
    }
}
