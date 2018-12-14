package task7.xml.parsers;

import task7.xml.entity.Plane;
import task7.xml.parsers.handlers.PlanesHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class PlanesSAXParser implements PlaneParser {

    public List<Plane> parseDocument(String xmlPath) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            PlanesHandler handler = new PlanesHandler();
            parser.parse(xmlPath, handler);
            return handler.getPlanes();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
