package mh.behavioral.mediator;

// Mediator
// when we have many objects that affect each other’s state change
// - in this case usage of observer would provide chaos
// - everyone is Observer and Observable
// - logic distributed in many events and object is not flexible for changes
// - Mediator: object recieve all information about changes and decide who should be notified
// - All login in one place
// - Mediator makes modeling easier
// - objects don’t know each other – they know only mediator
public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Auction aukcja = new Auction(10, mediator);
        Client k1 = new Client("Adam", 40, mediator);
        Client k2 = new Client("Robert", 30, mediator);

        mediator.register(aukcja, k1);
        mediator.register(aukcja, k2);

        for (int i = 0; i < 200; i += 10) {
            aukcja.setPrice(i);
        }
    }

}
