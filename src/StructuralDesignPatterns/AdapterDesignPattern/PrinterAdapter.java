package StructuralDesignPatterns.AdapterDesignPattern;

public class PrinterAdapter implements Printer{

    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter() {
        this.legacyPrinter = new LegacyPrinter();
    }
    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
    public void clientCode(Printer printer) {
        printer.print();
    }
}
