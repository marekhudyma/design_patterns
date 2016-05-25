package mh.behavioral.composite;

//The composite pattern describes that a group of objects are to be treated in the same way as a single instance
// of an object. The intent of a composite is to “compose” objects into tree structures to represent
// part-whole hierarchies. Implementing the composite pattern lets clients treat
// individual objects and compositions uniformly
public class Main {

    public static void main(String[] args) {
        Employee CEO = new EmployeeNode("John","CEO", 30000);

        Employee headSales = new EmployeeNode("Robert","Head Sales", 20000);

        Employee headMarketing = new EmployeeNode("Michel","Head Marketing", 20000);

        Employee clerk1 = new EmployeeNode("Laura","Marketing", 10000);
        Employee clerk2 = new EmployeeNode("Bob","Marketing", 10000);

        Employee salesExecutive1 = new EmployeeNode("Richard","Sales", 10000);
        Employee salesExecutive2 = new EmployeeNode("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        CEO.print();
    }

}
