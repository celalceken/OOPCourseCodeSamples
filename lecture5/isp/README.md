# Interface Segregation Principle (ISP)
The Interface Segregation Principle (ISP) is one of the five SOLID principles of object-oriented design. It states that no client should be forced to depend on methods it does not use. In other words, it's better to have many specific interfaces than a single, general-purpose interface.

## Violated Version
~~~java
// Fat Interface
package cc.oop.ders10.isp.violation;

public interface MultiFunctionDevice {
    void printDocument(String document);
    void scanDocument(String document);
    void faxDocument(String document);
}

// Multi-functional Device class
package cc.oop.ders10.isp.violation;

public class BasicPrinter implements MultiFunctionDevice {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void faxDocument(String document) {
        throw new UnsupportedOperationException("Fax not supported");
    }
}

// Application
package cc.oop.ders10.isp.violation;

public class Application {
    public static void main(String[] args) {
        MultiFunctionDevice device = new BasicPrinter();
        device.printDocument("Report.pdf");
        device.scanDocument("Invoice.pdf"); // Throws exception
    }
}

~~~

## Compliant Version

~~~java
// Client-Specific Interface for Printer
package cc.oop.ders10.isp.compliant;

public interface Printer {
    void printDocument(String document);
}

// Client-Specific Interface for Scanner
package cc.oop.ders10.isp.compliant;

public interface Scanner {
    void scanDocument(String document);
}

// Multi-functional Printer class
package cc.oop.ders10.isp.compliant;

public class MultiFunctionPrinter implements Printer, Scanner {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning document: " + document);
    }
}

// Application
package cc.oop.ders10.isp.compliant;

public class Application {
    public static void main(String[] args) {
        Printer printer = new MultiFunctionPrinter();
        printer.printDocument("Report.pdf");

        Scanner scanner = new MultiFunctionPrinter();
        scanner.scanDocument("Invoice.pdf");
    }
}

~~~