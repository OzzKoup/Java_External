import view.Printer;

import java.io.IOException;


public class Application {
    public static void main(String[] args) throws IOException {
        Printer printer = new Printer();
        printer.start();
    }
}
