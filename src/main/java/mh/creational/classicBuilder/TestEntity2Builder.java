package mh.creational.classicBuilder;

public class TestEntity2Builder extends TestEntity1Builder {

    public TestEntity2Builder(int id) {
        super(id);
    }

    //here I need to decide either return Entity1.Builder or Entity2.Builder
    public Entity2.Builder withTestDefaults() {
        return new Entity2.Builder(id)
                .withImageUrl("testDescription");
//        return new Entity2.Builder(id)
//                .withUrl("")
//                .withImageUrl("testDescription"); //compilation error

//        return new Entity2.Builder(id)
//                .withImageUrl("")
//                .withUrl(""); //compilation error, wrong EntityX.Builder
    }

}
