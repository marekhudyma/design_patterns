package mh.creational.factory.abstractFactory;

public class FactoryProducer {

    enum FactoryType {
        LINUX,
        WIN
    }

    public static AbstractFactory getFactory(FactoryType choice) {
        if (choice == FactoryType.WIN) {
            return new WinFactory();
        } else  {
            return new LinuxFactory();
        }
    }

}
