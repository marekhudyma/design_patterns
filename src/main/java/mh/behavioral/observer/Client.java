package mh.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {

    private String name;

    private double maxPrice;

    public Client(String name, double maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Auction) {
            Auction a = (Auction) o;
            System.out.println("Client " + name + ": has been informed about price change, to " + a.getPrice());
            if (a.getPrice() > maxPrice) {
                System.out.println("Client " + name + ": gave up because price was too high :(");
                o.deleteObserver(this);
            }
        }
    }
}


