package task7.xml.parsers.handlers;

import task7.xml.entity.Plane;
import task7.xml.entity.enumTypes.Crew;
import task7.xml.entity.enumTypes.PlaneType;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import task7.xml.entity.types.*;

import java.util.ArrayList;
import java.util.List;

public class PlanesHandler extends DefaultHandler {

    private List<Plane> planes = new ArrayList<>();

    private Plane plane;
    private Chars chars;
    private Ammo ammo;
    private Parameters parameters;

    private String contentHolder;

    public List<Plane> getPlanes() {
        return planes;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        switch (qName) {
            case "plane":
                plane = new Plane();
                plane.setId(attributes.getValue("id"));
                break;
            case "chars":
                chars = new Chars();
                break;
            case "ammo":
                ammo = new Ammo(Boolean.valueOf(attributes.getValue("status")));
                break;
            case "parameters":
                parameters = new Parameters();
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case "plane":
                planes.add(plane);
                break;
            case "model":
                plane.setModel(contentHolder);
                break;
            case "origin":
                plane.setOrigin(contentHolder);
                break;
            case "chars":
                plane.setChars(chars);
                break;
            case "type":
                chars.setPlaneType(PlaneType.valueOf(contentHolder));
                break;
            case "crew":
                chars.setCrew(Crew.valueOf(contentHolder));
                break;
            case "ammo":
                chars.setAmmo(ammo);
                break;
            case "rocket":
                chars.setRocket(new Rocket(Integer.valueOf(contentHolder)));
                break;
            case "radar":
                chars.setRadar(new Radar(Boolean.valueOf(contentHolder)));
                break;
            case "parameters":
                plane.setParameters(parameters);
                break;
            case "length":
                parameters.setLength(Integer.valueOf(contentHolder));
                break;
            case "width":
                parameters.setWidth(Integer.valueOf(contentHolder));
                break;
            case "height":
                parameters.setHeight(Integer.valueOf(contentHolder));
                break;
            case "price":
                plane.setPrice(Integer.valueOf(contentHolder));
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        contentHolder = String.valueOf(ch, start, length);
    }
}
