package mh.creational.singleton;

// you can create only one object
// private constructor
// static factory method: getInstance()
// create object when it is really required
// add synchronization when create an object
public class Singleton {

    private Singleton resource = null;

    public Singleton getInstance() {
        if (resource == null) {
            synchronized (Singleton.class) {
                if (resource == null)
                    resource = new Singleton();
            }
        }
        return resource;
    }

}
