package task7.xml;

import task7.xml.parsers.PlanesDOMParser;
import task7.xml.parsers.PlanesSAXParser;
import task7.xml.parsers.PlanesStAXParser;
import task7.xml.validator.PlanesXSDValidator;
import task7.xml.view.Printer;

public class Application {

    private static final String XSD_PATH = "src\\main\\resources\\Planes.xsd";
    private static final String XML_PATH = "src\\main\\resources\\Planes.xml";


    public static void main(String[] args) {
        if (PlanesXSDValidator.validate(XML_PATH, XSD_PATH)) {
            Printer.print(new PlanesDOMParser().parseDocument(XML_PATH));
            Printer.print(new PlanesSAXParser().parseDocument(XML_PATH));
            Printer.print(new PlanesStAXParser().parseDocument(XML_PATH));
        }
    }
}
