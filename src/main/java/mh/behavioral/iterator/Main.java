package mh.behavioral.iterator;

import java.util.Iterator;

//Iterator - pattern is used to traverse a container and access the container’s elements
public class Main {

    public static void main(String[] args) {
        Iterator it = new NameRepository().getIterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

}
