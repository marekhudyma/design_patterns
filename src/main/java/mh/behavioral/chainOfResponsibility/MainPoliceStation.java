package mh.behavioral.chainOfResponsibility;

public class MainPoliceStation extends PoliceUnit {

    public MainPoliceStation(){

    }

    public MainPoliceStation(Handler handler){
        this.nextHandler = handler;
    }

    public void processInfo(String meldunek) {
        System.out.println("MainPoliceStation: processing info " + meldunek);
    }
    public boolean handleEvent(String txt) {
        return postEvent(txt);
    }
}
