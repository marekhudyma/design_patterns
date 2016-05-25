package mh.creational.classicBuilder;

public class Main {

    public static void main(String[] args) {
        new TestEntity1Builder(1).withTestDefaults()
                                 .withDescription("otherDesciption")
                                 .withUrl("http://otherUrl.com")
                                 .build();

        new TestEntity2Builder(1).withTestDefaults()
                                 .withImageUrl("")
                                 .withDescription("")
                                 .build();
    }
}
