package task7.xml.view;

import task7.xml.entity.Plane;

import java.util.List;

public class Printer {

    public static void print(List<Plane> planes) {
        for (Plane plane : planes) {
            System.out.println(plane + "\n");
        }
    }
}
