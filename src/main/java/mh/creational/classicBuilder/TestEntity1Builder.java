package mh.creational.classicBuilder;

public class TestEntity1Builder {

    protected final int id;

    public TestEntity1Builder(int id) {
        this.id = id;
    }

    public Entity1.Builder withTestDefaults() {
        return new Entity1.Builder(id).withDescription("testDescription")
                                      .withUrl("http://someUrl.com");
    }

}
