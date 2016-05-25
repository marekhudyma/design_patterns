package mh.behavioral.observer;

// Observer
// Allows to sent automatically notifications to all interested objects when state is changed
// Elements:
// - Object that is being observed (Observable)
// - Observers register itself in object Observable and get automatically notifications about changes,
// example1 : Listenery in Swing
public class Main {

    public static void main(String[] args) {
        Auction auction = new Auction(10);

        Client k1 = new Client("Adam",40);
        Client k2 = new Client("Robert",30);

        auction.addObserver(k1);
        auction.addObserver(k2);

        for(int i=0;i<200;i+=10)
            auction.setPrice(i);

    }

}
