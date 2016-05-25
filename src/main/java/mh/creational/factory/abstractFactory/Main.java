package mh.creational.factory.abstractFactory;

import mh.creational.factory.abstractFactory.button.Button;
import mh.creational.factory.abstractFactory.scroll.Scroll;

public class Main {

//    Inside WinButton::paint() method.
//    Inside WinScroll::draw() method.
//    Inside LinuxButton::paint() method.
//    Inside LinuxScroll::draw() method.
    public static void main(String[] args) {
        {
            AbstractFactory guiFactory = FactoryProducer.getFactory(FactoryProducer.FactoryType.WIN);

            Button button = guiFactory.getButton();
            button.paint();

            Scroll scroll = guiFactory.getScroll();
            scroll.draw();
        }
        {
            AbstractFactory guiFactory = FactoryProducer.getFactory(FactoryProducer.FactoryType.LINUX);

            Button button = guiFactory.getButton();
            button.paint();

            Scroll scroll = guiFactory.getScroll();
            scroll.draw();
        }
    }
}
