package mh.behavioral.chainOfResponsibility;

public class Cheriff extends PoliceUnit {

    public Cheriff(){

    }

    public Cheriff(Handler handler){
        this.nextHandler = handler;
    }

    public void processInfo(String meldunek) {
        System.out.println("Cherif: processing info " + meldunek);
    }

    public boolean handleEvent(String txt) {

        if (txt.contains("thief")) {
            processInfo(txt);
            return true;
        } else {
            return postEvent(txt);
        }

    }

}
