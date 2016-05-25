package mh.behavioral.mediator;

public class Auction implements Notifiable {

    private double price;
    private Mediator mediator;

    public Auction(double price, Mediator mediator) {
        this.price = price;
        this.mediator = mediator;
    }

    public void setPrice(double price) {
        this.price = price;
        mediator.changed(this);
    }

    public double getPrice() {
        return price;
    }

    public void update(Notifiable notifiable){

    }
}
