package Alone_factory_method;


public class MclarenGarage implements EngineManufacturer {

    @Override
    public Engine buildEngine(EngineType engineType) {
        return new MclarenEngine(engineType);
    }
}
