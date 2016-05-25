package mh.creational.factory.abstractFactory;

import mh.creational.factory.abstractFactory.button.Button;
import mh.creational.factory.abstractFactory.button.LinuxButton;
import mh.creational.factory.abstractFactory.scroll.LinuxScroll;
import mh.creational.factory.abstractFactory.scroll.Scroll;

public class LinuxFactory extends AbstractFactory {

    @Override
    Button getButton() {
        return new LinuxButton();
    }

    @Override
    Scroll getScroll() {
        return new LinuxScroll();
    }

}
