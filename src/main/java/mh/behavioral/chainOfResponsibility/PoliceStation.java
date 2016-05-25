package mh.behavioral.chainOfResponsibility;

public class PoliceStation extends PoliceUnit {

    public PoliceStation(){

    }

    public PoliceStation(Handler handler){
        this.nextHandler = handler;
    }

    public void processInfo(String info) {
        System.out.println("PoliceStation: processing info " + info);
    }

    public boolean handleEvent(String txt) {
        return postEvent(txt);
    }
}
