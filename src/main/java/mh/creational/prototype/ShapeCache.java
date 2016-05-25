package mh.creational.prototype;

import mh.creational.prototype.shape.Circle;
import mh.creational.prototype.shape.Rectangle;
import mh.creational.prototype.shape.Shape;
import mh.creational.prototype.shape.ShapeType;

import java.util.concurrent.ConcurrentHashMap;

public class ShapeCache {

    private static ConcurrentHashMap<String, Shape> shapeMap  = new ConcurrentHashMap<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(ShapeType.CIRCLE.name(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(ShapeType.RECTANGLE.name(), rectangle);
    }
}
