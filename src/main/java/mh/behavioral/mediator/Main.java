package mh.behavioral.mediator;

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
