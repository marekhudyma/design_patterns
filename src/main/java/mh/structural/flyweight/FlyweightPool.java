package mh.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class FlyweightPool {

    private Set<Article> pool = new HashSet<>();

    public Article getArticle(String name, double price) {
        for (Article a : pool) {
            if (a.getName().equals(name) && a.getPrice() == price) {
                return a;
            }
        }
        Article newArticle = new Article(name, price);
        pool.add(newArticle);
        return newArticle;
    }

    public int getPoolSize() {
        return pool.size();
    }

}
