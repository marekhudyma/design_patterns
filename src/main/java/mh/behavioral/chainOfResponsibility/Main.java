package mh.behavioral.chainOfResponsibility;

// Chain of Responsibility
// - there is event and nobody knows who should serve it
// - event is send to first handler
// - if first won’t serve it, it is send to another
// Advantages
// - object that create event doesn’t have to know how to handle it
// - Elastic structure, can be easily modified
// - objects that receive decide (not mediator or observable) if are interested or not
// Disadvantage
// - some of event can be not handle at all
// - not efective for long chains of handlers
public class Main {

    public static void main(String[] args) {
        FBI abw = new FBI();
        MainPoliceStation mainPoliceStation = new MainPoliceStation(abw);
        PoliceStation policeStation = new PoliceStation(mainPoliceStation);
        Cheriff cheriff = new Cheriff(policeStation);

        boolean result = cheriff.handleEvent("thief incident");
        if(result == false){
            System.out.println("no action");
        }
        System.out.println("------");
        result = cheriff.handleEvent("terror alarm");
        if(result == false){
            System.out.println("no action");
        }
        System.out.println("------");
        result = cheriff.handleEvent("vandal incident");
        if(result == false){
            System.out.println("no action");
        }
    }
}
