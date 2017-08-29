package strategy;


public class ItemToDeliver {

    private final IShipment shipment;

    public ItemToDeliver(IShipment shipment) {
        this.shipment = shipment;
    }

    public double deliveryPrice(double miles, double weight, DeliverType deliverType) {
        return shipment.calculatePrice(miles, weight, deliverType);
    }

}
