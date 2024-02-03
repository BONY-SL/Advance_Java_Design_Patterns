package StructuralDesignPatterns.AdapterDesignPattern;

public class PrinterAdapter implements Printer{
    @Override
    public void print() {
        legacyPrinter.printDocument();
    }

    private LegacyPrinter legacyPrinter;

    public PrinterAdapter() {
        this.legacyPrinter = new LegacyPrinter();
    }

    public void clientCode(Printer printer) {
        printer.print();
    }
}
