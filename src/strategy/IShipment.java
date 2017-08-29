package strategy;

import iterator.Item;

import java.util.List;


public interface IShipment {

    double calculatePrice(double miles, double weight, DeliverType deliveryType);

    void addItems(List<Item> myList);

    List<Item> getItems();
}
