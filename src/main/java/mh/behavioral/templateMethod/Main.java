package mh.behavioral.templateMethod;

// Templating method allow to create an algorith that will be clarified in subclass
// we know how the algorith looks like but details will be finished in subclass (or delegated)
// for example Sorting, we know how to sort but comparison will done later
public class Main {

    public static void main(String[] args) {
        DataParser parser = new CSVDataParser();
        parser.parseDataAndGenerateOutput();
    }
}
