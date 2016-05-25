package mh.creational.builder.fluent.tmp1;

public class Main {

    public static void main(String[] args) {

        Entity2 entity2 = new Entity2.Builder()
                .withId(1)
                .withUrl(2)
                .withId(1)
                .build();
    }
}
