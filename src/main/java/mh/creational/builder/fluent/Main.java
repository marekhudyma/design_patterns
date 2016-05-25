package mh.creational.builder.fluent;

public class Main {

    public static void main(String []args) {
        Cake cake = new Cake()
                .prepare()
                .addFlour()
                .addSugar()
                .mix()
                .bake();


        Pizza pizza = new Pizza()
                .prepare()
                .addSauce()
                .addCheese()
                .bake();
    }
}
