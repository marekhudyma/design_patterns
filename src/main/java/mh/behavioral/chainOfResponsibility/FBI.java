package mh.behavioral.chainOfResponsibility;

public class FBI extends PoliceUnit {

    public FBI(){

    }

    public FBI(Handler handler){
        this.nextHandler = handler;
    }

    public void processInfo(String meldunek) {
        System.out.println("FBI: processing info " + meldunek);
    }

    public boolean handleEvent(String txt) {
        if (txt.contains("terror") ) {
            processInfo(txt);
            return true;
        } else {
            return postEvent(txt);
        }
    }
}
