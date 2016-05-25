package mh.structural.flyweight;

//Flyweight is an object that minimizes memory use by sharing as much data as possible with other similar objects;
//it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount
//of memory
//A classic example usage of the flyweight pattern is the data structures for graphical representation of characters
//in a word processor. It might be desirable to have, for each character in a document
public class Main {

    public static void main(String[] args) {

        FlyweightPool pool = new FlyweightPool();
        pool.getArticle("aaa", 1.0);
        pool.getArticle("bbb", 2.0);
        pool.getArticle("aaa", 1.0);

        System.out.println(pool.getPoolSize());
    }
}
