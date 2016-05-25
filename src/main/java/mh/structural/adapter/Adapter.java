package mh.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements Required {

    private DummyLibrary dummyLibrary = new DummyLibrary();

    public List<String> getNumbersAsString() {
        List<String> numbersAsString = new ArrayList<String>();
        for(Integer i : dummyLibrary.getNumbers()) {
            numbersAsString.add(String.valueOf(i));
        }
        return numbersAsString;
    }
}
