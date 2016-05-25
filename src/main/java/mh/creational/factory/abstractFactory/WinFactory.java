package mh.creational.factory.abstractFactory;

import mh.creational.factory.abstractFactory.button.Button;
import mh.creational.factory.abstractFactory.button.WinButton;
import mh.creational.factory.abstractFactory.scroll.Scroll;
import mh.creational.factory.abstractFactory.scroll.WinScroll;

public class WinFactory extends AbstractFactory {

    @Override
    public Button getButton() {
        return new WinButton();
    }

    @Override
    Scroll getScroll() {
        return new WinScroll();
    }

}
