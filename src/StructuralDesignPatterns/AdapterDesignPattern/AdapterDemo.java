package StructuralDesignPatterns.AdapterDesignPattern;

public class AdapterDemo {
    public static void main(String[] args) {

        PrinterAdapter adapter=new PrinterAdapter();
        adapter.clientCode(adapter);

    }
}
