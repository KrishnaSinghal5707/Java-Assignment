abstract class Printer {
    // Abstract method (to be overridden)
    abstract void print();
}

class DocumentPrinter extends Printer {
    
    // 1. Method Overriding: Providing specific implementation for the abstract method
    @Override
    void print() {
        System.out.println("Printing a blank document...");
    }

    // 2. Method Overloading: Same method name, different parameters
    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    // 2. Method Overloading: Same method name, different parameter types/counts
    void print(String text, int copies) {
        for (int i = 1; i <= copies; i++) {
            System.out.println("Copy " + i + ": " + text);
        }
    }
}

public class AbstractConceptDemo {
    public static void main(String[] args) {
        DocumentPrinter docPrinter = new DocumentPrinter();
        
        docPrinter.print();                  // Calls overridden method
        docPrinter.print("Hello World!");    // Calls overloaded method 1
        docPrinter.print("Java OOP", 3);     // Calls overloaded method 2
    }
}
