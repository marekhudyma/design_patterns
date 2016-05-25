package mh.behavioral.mediator;

public class Client implements Notifiable {

    private String name;
    private double maxPrice;
    private Mediator mediator;

    public Client(String name, double maxPrice, Mediator m) {
        this.name = name;
        this.maxPrice = maxPrice;
        this.mediator = m;
    }

    public void update(Notifiable notifiable){
        Auction a = (Auction) notifiable;
        System.out.println(name + " I was notified, price= " + a.getPrice() );

        if(a.getPrice() > this.maxPrice){
            System.out.println("Client " + name + ": gave up because price was too high :(");
            this.mediator.unregister(a, this);
        }
    }

}
