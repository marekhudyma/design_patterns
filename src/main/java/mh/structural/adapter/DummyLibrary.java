package mh.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DummyLibrary {

    public List<Integer> getNumbers() {
        return new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(2);
        }};
    }

}
