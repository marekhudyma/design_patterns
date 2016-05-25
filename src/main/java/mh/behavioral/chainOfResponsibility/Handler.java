package mh.behavioral.chainOfResponsibility;

public abstract class Handler {

    protected Handler nextHandler;

    public abstract boolean handleEvent(String txt);

    protected boolean postEvent(String txt) {
        if (nextHandler != null)
            return nextHandler.handleEvent(txt);
        else
            return false;
    }

}
