package mh.creational.prototype;

import mh.creational.prototype.shape.Shape;
import mh.creational.prototype.shape.ShapeType;

//Prototype
// - when creation of new object is very expensive, we create template object (prototype)
// - class store an prototype object
// - method getInstance make copy of object ? object.clone()
// Clone in Java
// Method clone() is protected in Object
// In Class X we add implements Cloneable
// public X clone() { return (X)super.clone(); }
// Method clone() make only shallow copy (reference types are not copied)

public class Main {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape(ShapeType.CIRCLE.name());
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape(ShapeType.RECTANGLE.name());
        System.out.println("Shape : " + clonedShape2.getType());
    }

}
