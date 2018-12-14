package task7.xml.parsers;

import task7.xml.entity.Plane;

import java.util.ArrayList;
import java.util.List;

public interface PlaneParser {
    List<Plane> planes = new ArrayList<>();
    List<Plane> parseDocument(String xmlPath);
}
