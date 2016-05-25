package mh.creational.builder.fluent;

public class Cake extends BakedGood<Cake> {

    public Cake addSugar() {
        System.out.println("adding sugar");
        return this;
    }

    public Cake addFlour() {
        System.out.println("adding flour");
        return this;
    }

    public Cake mix() {
        System.out.println("mixing");
        return this;
    }

    public Cake bake() {
        System.out.println("baking at 325 degrees");
        return this;
    }

}
