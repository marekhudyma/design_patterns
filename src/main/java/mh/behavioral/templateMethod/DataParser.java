package mh.behavioral.templateMethod;


abstract public class DataParser {

    public void parseDataAndGenerateOutput() {
        readData();
        processData();
        writeData();
    }

    abstract void readData();

    abstract void writeData();

    public void processData() {
        System.out.println("Processing data");
    }

}
