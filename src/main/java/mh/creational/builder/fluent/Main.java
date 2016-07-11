package mh.creational.builder.fluent;

public class Main {

    public static void main(String []args) {

        Parent parent = new Parent.Builder(1)
                .withParentOptional("optional")
                .build();

        Child child = new Child.Builder(1, 2)
                .withParentOptional("parentOptional")
                .withChildOptional("childrenOptional")
                .build();
    }

}
