package mh.creational.factory.abstractFactory;

import mh.creational.factory.abstractFactory.button.Button;
import mh.creational.factory.abstractFactory.scroll.Scroll;

public abstract class AbstractFactory {

    abstract Button getButton();

    abstract Scroll getScroll();

}
