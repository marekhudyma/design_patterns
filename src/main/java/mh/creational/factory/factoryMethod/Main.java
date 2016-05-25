package mh.creational.factory.factoryMethod;

//Factory Method
//- we use Product, but method of creation of product can change, so we want to separate creation of product.
//- we put creation of product to separate method. We can override only this method
//- if there is a new ProcuctC, we create a new ClassC (and override one method) and create ProductC
//Efects:
//-fulfill the Open-Close,
//-don’t have to change existing code,
//-add new code,
//-no code duplication
public class Main {

    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Vehicle myVehicle = factory.prepairVehicle();
        myVehicle.test();

        factory = new TruckFactory();
        Vehicle myVehicle2 = factory.prepairVehicle();
        myVehicle2.test();
    }

}
