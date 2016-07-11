package mh.creational.builder.classic;


public class Main {

    public static void main(String []args) {

        Parent parent = new Parent.Builder(1)
                .withParentOptional("optional")
                .build();

        Child child = new Child.Builder(1, 2)
                //.withParentOptional("parentOptional")  //<----------- compilation problem
                .withChildOptional("childrenOptional")   //<----------- compilation problem
                .build();
    }

}
