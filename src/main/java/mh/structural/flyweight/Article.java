package mh.structural.flyweight;

public class Article {

    private StringBuffer name;
    private double price;

    public Article(String name, double price) {
        this.name = new StringBuffer(name);
        this.price = price;
    }

    public String getName() {
        return name.toString();
    }

    public double getPrice() {
        return price;
    }


}
